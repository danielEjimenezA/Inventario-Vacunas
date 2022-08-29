package com.kruger.inventario.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kruger.inventario.model.Usuario;

public interface UsuarioDao extends JpaRepository<Usuario, Integer> {

}
