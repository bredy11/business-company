package com.comanda.digital.business.company.api.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.comanda.digital.business.company.api.dto.filterQuery.UsuarioDTO;
import com.comanda.digital.business.company.service.UsuarioService;

import jakarta.validation.Valid;


@RestController
@RequestMapping(value = "/v1/usuario", produces = MediaType.APPLICATION_JSON_VALUE)
public class UsuarioController {

	private UsuarioService usuarioService;

	@Autowired
	public UsuarioController(UsuarioService usuarioService) {
		this.usuarioService = usuarioService;
	}

	@PostMapping
	public UsuarioDTO criar(@Valid @RequestBody UsuarioDTO usuarioDTO) {

		return usuarioService.criar(usuarioDTO);
	}
	
	@GetMapping("/id/{id}")
	public UsuarioDTO getUsuario(@PathVariable(required = true)  Long id) {
		return usuarioService.buscarId(id);

	}
}
