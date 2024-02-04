package com.comanda.digital.business.company.excepition;

import org.springframework.http.HttpStatus;

import java.util.Optional;

public interface DetailsProblem {

    HttpStatus httpStatus();

    Optional<String> message();

    public default ProblemDetailResponseDTO getResponseErrorDto() {
        Optional<String> errorCode = message();

        if (errorCode.isPresent()) {
            return new ProblemDetailResponseDTO(String.valueOf(errorCode.get()), httpStatus().getReasonPhrase(),
                    httpStatus().value(), errorCode.get());
        } else {
            return new ProblemDetailResponseDTO();
        }
    }

}
