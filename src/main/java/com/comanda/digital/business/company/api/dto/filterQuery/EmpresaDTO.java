package com.comanda.digital.business.company.api.dto.filterQuery;

import java.util.List;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class EmpresaDTO {
	private Long id;
	private String nome;
	private String telefone;
	private List<MesaDTO> mesas;
	private Long idUsuario;

	
	
}
