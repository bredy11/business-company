package com.comanda.digital.business.company.api.dto.filterQuery;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ClienteDTO {
	
	private Long id;
	
	@NotBlank(message = "O campo nome é obrigatorio.")
	private String nome;
	
	@NotNull(message = "Id da mesa é obrigatorio.")
	private Long mesaId;

}
