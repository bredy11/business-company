package com.comanda.digital.business.company.service;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.comanda.digital.business.company.api.dto.filterQuery.EmpresaDTO;
import com.comanda.digital.business.company.model.Empresa;
import com.comanda.digital.business.company.repository.EmpresaRepository;

@Service
public class EmpresaService {
	@Autowired
	private EmpresaRepository empresaRepository;

	private ModelMapper modelMapper = new ModelMapper();

	public EmpresaDTO criar(EmpresaDTO empresaDTO) {
		Empresa empresa = modelMapper.map(empresaDTO, Empresa.class);

		empresa.setUsuarioId(empresaDTO.getIdUsuario());

		return modelMapper.map(empresaRepository.save(empresa), EmpresaDTO.class);
	}

	public EmpresaDTO buscarId(Long id) {
		return modelMapper.map(empresaRepository.findById(id), EmpresaDTO.class);
	}

}
