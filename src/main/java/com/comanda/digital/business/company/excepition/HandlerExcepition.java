package com.comanda.digital.business.company.excepition;

import org.springframework.core.annotation.Order;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.core.Ordered;

@Order(Ordered.HIGHEST_PRECEDENCE)
@ControllerAdvice
public class HandlerExcepition {

	

 
    @ExceptionHandler(value = MethodArgumentNotValidException.class)
    public ResponseEntity<ResponseDTO> handle(MethodArgumentNotValidException methodArgumentNotValidException) {
    
    	return ResponseEntity.badRequest()
    			.contentType(MediaType.APPLICATION_PROBLEM_JSON)
    			.body(new ProblemDetailResponseDTO("1",methodArgumentNotValidException.getFieldError().getDefaultMessage(),methodArgumentNotValidException.getStatusCode().value() ,methodArgumentNotValidException.getMessage() ));
    }
    
    @ExceptionHandler(value = Exception.class)
    public ResponseEntity<ResponseDTO> handle(Exception Exception) {
        return ResponseEntity.badRequest()
                .contentType(MediaType.APPLICATION_PROBLEM_JSON)
                .body(new ProblemDetailResponseDTO("1","Campo inválido",500 ,"algo deu errado" ));
    }
}
