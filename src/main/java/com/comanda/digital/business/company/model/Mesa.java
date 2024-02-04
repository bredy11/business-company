package com.comanda.digital.business.company.model;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Mesa {
	@Id 
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String nome;
	private String linkQrcode;
	
	@Column(name = "empresa_id")
	private Long empresaId;
	
	@OneToMany 
	@JoinColumn(name = "mesa_id")
	private List<Cliente> clientes;
	
 
}
