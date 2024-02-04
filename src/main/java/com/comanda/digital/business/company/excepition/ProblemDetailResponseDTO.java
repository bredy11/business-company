package com.comanda.digital.business.company.excepition;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ProblemDetailResponseDTO implements ResponseDTO {


    private String code;

    private String title;

    private Integer status;

    private String detail;

    
}

