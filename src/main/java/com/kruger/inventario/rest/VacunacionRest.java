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

import com.kruger.inventario.dao.VacunacionDAO;
import com.kruger.inventario.model.Vacunacion;

@RestController
@RequestMapping("vacunacion")
public class VacunacionRest {

	@Autowired
	private VacunacionDAO vacunacionDAO;
	
	@PostMapping("/guardar")
	public void guardar(@RequestBody Vacunacion vacunacion) {
		vacunacionDAO.save(vacunacion);
	}

	@GetMapping("/listar")
	public List<Vacunacion> listar() {
		return vacunacionDAO.findAll();
	}

	@DeleteMapping("/eliminar/{id}")
	public void eliminar(@PathVariable("id") Integer id) {
		vacunacionDAO.deleteById(id);
	}

	@PutMapping("/actualizar")
	public void actualizar(@RequestBody Vacunacion vacunacion) {
		vacunacionDAO.save(vacunacion);
	}

}
