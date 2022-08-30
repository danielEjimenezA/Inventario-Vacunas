package com.kruger.inventario.model;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Empleado {

	@Id
	private String cedula;

	@Column
	private String nombres;

	@Column
	private String apellidos;

	@Column
	private String correoElectronico;

	@Column(nullable = true)
	private Date fechaNacimiento;

	@Column
	private String direccionDomicilio;

	@Column
	private String telefonoMovil;

	@Column
	private Boolean estadoVacunacion;

	@JoinColumn(name = "idUsuario", referencedColumnName = "idUsuario", nullable = true)
	@ManyToOne(optional = true)
	private Usuario idUsuario;
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "idEmpleado")
	private List<Vacunacion> vacunacionList;

	public String getCedula() {
		return cedula;
	}

	public void setCedula(String cedula) {
		this.cedula = cedula;
	}

	public String getNombres() {
		return nombres;
	}

	public void setNombres(String nombres) {
		this.nombres = nombres;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getCorreoElectronico() {
		return correoElectronico;
	}

	public void setCorreoElectronico(String correoElectronico) {
		this.correoElectronico = correoElectronico;
	}

	public Date getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(Date fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public String getDireccionDomicilio() {
		return direccionDomicilio;
	}

	public void setDireccionDomicilio(String direccionDomicilio) {
		this.direccionDomicilio = direccionDomicilio;
	}

	public String getTelefonoMovil() {
		return telefonoMovil;
	}

	public void setTelefonoMovil(String telefonoMovil) {
		this.telefonoMovil = telefonoMovil;
	}

	public Boolean getEstadoVacunacion() {
		return estadoVacunacion;
	}

	public void setEstadoVacunacion(Boolean estadoVacunacion) {
		this.estadoVacunacion = estadoVacunacion;
	}

	public Usuario getIdUsuario() {
		return idUsuario;
	}

	public void setIdUsuario(Usuario idUsuario) {
		this.idUsuario = idUsuario;
	}

}
