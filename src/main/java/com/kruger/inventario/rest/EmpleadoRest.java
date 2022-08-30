package com.kruger.inventario.rest;

import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
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
import com.kruger.inventario.dao.RolDAO;
import com.kruger.inventario.dao.UsuarioDao;
import com.kruger.inventario.model.Empleado;
import com.kruger.inventario.model.Rol;
import com.kruger.inventario.model.Usuario;

@RestController
@RequestMapping("empleado")
public class EmpleadoRest {

	@Autowired
	EmpleadoDAO empleadoDAO;
	
	@Autowired
	RolDAO rolDAO;
	
	@Autowired
	UsuarioDao usuarioDAO;

	@PostMapping("/guardar")
	public void guardar(@RequestBody Empleado empleado) {
		empleadoDAO.save(empleado);
	}

	@PostMapping("/registrar")
	public void registrar(@RequestBody Empleado empleado) {
		Pattern patternEmail = Pattern.compile("^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
						+ "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$");
		Pattern patternNombres  = Pattern.compile("[a-zA-Z ]{2,254}");
		if(empleado.getCedula().length() == 10) {
			Matcher matherEmail = patternEmail.matcher(empleado.getCorreoElectronico());
			if(matherEmail.find() == true) {
				Matcher matherNombres = patternNombres.matcher(empleado.getApellidos()+" " +empleado.getNombres());
				if(matherNombres.find() == true) {
					empleadoDAO.save(empleado);
					
					Usuario usuario = new Usuario();
					usuario.setNombreUsuario(empleado.getCedula());
					usuario.setPasswordUsuario(empleado.getCedula());
					usuario.setEstadoUsuario(true);
					Rol rol = rolDAO.findById(2).get();
					usuario.setRolUsuario(rol);
					usuarioDAO.save(usuario);
					
				}
			}
		}
		
	}

	@GetMapping("/listar")
	public List<Empleado> listar() {
		return empleadoDAO.findAll();
	}

	@DeleteMapping("/eliminar/{id}")
	public void eliminar(@PathVariable("id") String cedula) {
		empleadoDAO.deleteById(cedula);
	}

	@PutMapping("/actualizar")
	public void actualizar(@RequestBody Empleado empleado) {
		Empleado empleadoupdate = empleadoDAO.findById(empleado.getCedula()).get();
		empleadoupdate.setFechaNacimiento(empleado.getFechaNacimiento());
		empleadoupdate.setDireccionDomicilio(empleado.getDireccionDomicilio());
		empleadoupdate.setTelefonoMovil(empleado.getTelefonoMovil());
		empleadoupdate.setEstadoVacunacion(empleado.getEstadoVacunacion());
		empleadoDAO.save(empleadoupdate);
	}

}
