package com.kruger.inventario.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kruger.inventario.model.Rol;

public interface RolDAO extends JpaRepository<Rol, Integer> {
	
}
