package com.comanda.digital.business.company.api.dto.filterQuery;

import java.util.List;

import com.comanda.digital.business.company.model.Empresa;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class UsuarioDTO {

	private Long id;

	@NotBlank(message = "O nome é obrigatório")
	private String nome;
	
	@NotBlank(message = "A senha é obrigatoria")
	private String senha;

	@NotBlank(message = "Telefone é obrigatorio")
	private String telefone;

	@NotBlank(message = "O e-mail é obrigatório")
	@Email(message = "E-mail inválido")
	private String email;

	private List<Empresa> empresas;

}
