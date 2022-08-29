package com.kruger.inventario.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kruger.inventario.model.Vacunacion;

public interface VacunacionDAO extends JpaRepository<Vacunacion, Integer> {

}
