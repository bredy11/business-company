package com.comanda.digital.business.company.service;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.comanda.digital.business.company.api.dto.filterQuery.UsuarioDTO;
import com.comanda.digital.business.company.model.Usuario;
import com.comanda.digital.business.company.repository.UsuarioRepository;

@Service
public class UsuarioService {

	private UsuarioRepository usuarioRepository;
	private ModelMapper modelMapper = new ModelMapper();

	@Autowired
	public UsuarioService(UsuarioRepository usuarioRepository) {
		this.usuarioRepository = usuarioRepository;
	}

	public UsuarioDTO criar(UsuarioDTO usuarioDTO) {

		Usuario usuario = modelMapper.map(usuarioDTO, Usuario.class);
		usuario = usuarioRepository.save(usuario);
		return modelMapper.map(usuario, UsuarioDTO.class);
	}

	public UsuarioDTO buscarId(Long id) {
		return modelMapper.map(buscarIdUsuario(id), UsuarioDTO.class);
	}

	public Usuario buscarIdUsuario(Long id) {
		return usuarioRepository.findById(id).get();
	}
}
