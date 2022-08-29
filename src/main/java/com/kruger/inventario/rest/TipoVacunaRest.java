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

import com.kruger.inventario.dao.TipoVacunaDAO;
import com.kruger.inventario.model.TipoVacuna;

@RestController
@RequestMapping("tipovacuna")
public class TipoVacunaRest {
	
	@Autowired
	TipoVacunaDAO tipoVacunaDAO;
	
	@PostMapping("/guardar")
	public void guardar(@RequestBody TipoVacuna tipoVacuna) {
		tipoVacunaDAO.save(tipoVacuna);
	}
	
	@GetMapping("/listar")
	public List<TipoVacuna> listar(){
		return tipoVacunaDAO.findAll();
	}
	
	@DeleteMapping("/eliminar/{id}")
	public void eliminar(@PathVariable("id") Integer id) {
		tipoVacunaDAO.deleteById(id);
	}
	
	@PutMapping("/actualizar")
	public void actualizar(@RequestBody TipoVacuna tipoVacuna) {
		tipoVacunaDAO.save(tipoVacuna);
	}

}
