package com.kruger.inventario.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kruger.inventario.dao.EmpleadoDAO;
import com.kruger.inventario.model.Empleado;

@RestController
@RequestMapping("empleado")
public class EmpleadoRest {
	
	@Autowired
	EmpleadoDAO empleadoDAO;
	
	@PostMapping("/guardar")
	public void guardar(@RequestBody Empleado empleado) {
		empleadoDAO.save(empleado);
	}
	
	@GetMapping("/listar")
	public List<Empleado> listar(){
		return empleadoDAO.findAll();
	}
	
	@DeleteMapping("/eliminar/{id}")
	public void eliminar(@PathVariable("id") String cedula) {
		empleadoDAO.deleteById(cedula);
	}
	
	@PutMapping("/actualizar")
	public void actualizar(@RequestBody Empleado empleado) {
		empleadoDAO.save(empleado);
	}

}
