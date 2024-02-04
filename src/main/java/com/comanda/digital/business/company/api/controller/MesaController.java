package com.comanda.digital.business.company.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.comanda.digital.business.company.api.dto.filterQuery.MesaDTO;
import com.comanda.digital.business.company.service.MesaService;

import jakarta.validation.Valid;

@RestController
@RequestMapping(value = "/v1/mesa", produces = MediaType.APPLICATION_JSON_VALUE)
public class MesaController {

	@Autowired
	private MesaService mesaService;

	@PostMapping
	public ResponseEntity<Void> criarMesa(@Valid @RequestBody MesaDTO mesaDTO) {

		mesaService.criarMesa(mesaDTO);
		return ResponseEntity.ok().build();
	}

	@GetMapping("/empresa/id/{id}")
	public ResponseEntity<List<MesaDTO>> listarTodasMesaDeUmaEmpresa(@PathVariable(required = true) Long id) {

		return ResponseEntity.ok(mesaService.buscarMesas(id));
	}

}
