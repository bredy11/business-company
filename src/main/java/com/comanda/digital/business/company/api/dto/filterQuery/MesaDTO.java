package com.comanda.digital.business.company.api.dto.filterQuery;

import java.util.List;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class MesaDTO {
	private Long id;
	@NotBlank(message = "O nome ou numero da mesa é obrigatório.")
	private String nome;
	private String linkQrcode;
	private List<ClienteDTO> clientes;
	@NotNull(message = "Id da empresa obrigatorio")
	private Long empresaId;

}
