package com.comanda.digital.business.company.service;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.comanda.digital.business.company.api.dto.filterQuery.ClienteDTO;
import com.comanda.digital.business.company.model.Cliente;
import com.comanda.digital.business.company.repository.ClienteRepository;

@Service
public class ClienteService {

	@Autowired
	private ClienteRepository clienteRepository;
	
	 
	private ModelMapper mapper =  new ModelMapper();

	public void criarCliente(ClienteDTO clienteDTO) {
		clienteRepository.save(mapper.map(clienteDTO, Cliente.class));

	}

}
