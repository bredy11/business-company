package com.comanda.digital.business.company.mapper;

import org.mapstruct.Mapper;

import com.comanda.digital.business.company.api.dto.filterQuery.UsuarioDTO;
import com.comanda.digital.business.company.model.Usuario;

@Mapper(componentModel = "spring")
public interface UsuarioMapper {


	UsuarioDTO usuarioToUsuarioDTO(Usuario usuario);
	
	Usuario usuarioDTOToUsuario(UsuarioDTO usuarioDTO);

 }
