package com.comanda.digital.business.company.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.comanda.digital.business.company.api.dto.filterQuery.ClienteDTO;
import com.comanda.digital.business.company.service.ClienteService;

import jakarta.validation.Valid;

@RestController
@RequestMapping(value = "/v1/cliente", produces = MediaType.APPLICATION_JSON_VALUE)
public class ClienteController {

	@Autowired
	private ClienteService clienteService;

	@PostMapping
	public ResponseEntity<Void> criar(@Valid @RequestBody ClienteDTO cliente) {
		clienteService.criarCliente(cliente);
		return ResponseEntity.ok().build();
	}

}
