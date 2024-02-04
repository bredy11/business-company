package com.comanda.digital.business.company.service;

import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.comanda.digital.business.company.api.dto.filterQuery.MesaDTO;
import com.comanda.digital.business.company.model.Mesa;
import com.comanda.digital.business.company.repository.MesaRepository;

@Service
public class MesaService {
	@Autowired
	private MesaRepository mesaRepository;
	private ModelMapper modelMapper = new ModelMapper();

	public void criarMesa(MesaDTO mesaDTO) {

		mesaRepository.save(modelMapper.map(mesaDTO, Mesa.class));
	}

	public List<MesaDTO> buscarMesas(Long id) {
		List<Mesa> mesasEmpresa = mesaRepository.findByEmpresaId(id);

		return mesasEmpresa.stream().map(m -> modelMapper.map(m, MesaDTO.class)).toList();
	}

}
