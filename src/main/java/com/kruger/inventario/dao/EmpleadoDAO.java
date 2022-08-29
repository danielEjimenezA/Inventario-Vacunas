package com.kruger.inventario.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kruger.inventario.model.Empleado;

public interface EmpleadoDAO extends JpaRepository<Empleado, String> {

}
