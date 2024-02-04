package com.comanda.digital.business.company.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.comanda.digital.business.company.model.Empresa;
import com.comanda.digital.business.company.model.Mesa;

public interface MesaRepository extends  JpaRepository<Mesa, Long> {

	List<Mesa> findByEmpresaId(Long empresaId);
}
