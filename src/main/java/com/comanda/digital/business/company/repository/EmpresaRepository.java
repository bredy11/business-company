package com.comanda.digital.business.company.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.comanda.digital.business.company.model.Empresa;

public interface EmpresaRepository extends  JpaRepository<Empresa, Long> {

}
