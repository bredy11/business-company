package com.comanda.digital.business.company.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.comanda.digital.business.company.model.Usuario;

public interface UsuarioRepository extends  JpaRepository<Usuario, Long> {

}
