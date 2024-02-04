package com.comanda.digital.business.company.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.comanda.digital.business.company.model.Cliente;

public interface ClienteRepository extends  JpaRepository<Cliente, Long> {

}
