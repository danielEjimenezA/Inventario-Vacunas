package com.kruger.inventario.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kruger.inventario.model.TipoVacuna;

public interface TipoVacunaDAO extends JpaRepository<TipoVacuna, Integer> {

}
