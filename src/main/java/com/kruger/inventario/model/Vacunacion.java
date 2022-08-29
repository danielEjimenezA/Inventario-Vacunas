package com.kruger.inventario.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Vacunacion {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idVacunacion;

	@Column
	private String cedulaEmpleado;

	@Column
	private Date fechaVacunacion;

	@Column
	private Integer nroDosisVacunacion;

	@JoinColumn(name = "idEmpleado", referencedColumnName = "cedula")
	@ManyToOne(optional = false)
	private Empleado idEmpleado;

	@JoinColumn(name = "idTipoVacuna", referencedColumnName = "idTipoVacuna")
	@ManyToOne(optional = false)
	private TipoVacuna idTipoVacuna;

	public Integer getIdVacunacion() {
		return idVacunacion;
	}

	public void setIdVacunacion(Integer idVacunacion) {
		this.idVacunacion = idVacunacion;
	}

	public String getCedulaEmpleado() {
		return cedulaEmpleado;
	}

	public void setCedulaEmpleado(String cedulaEmpleado) {
		this.cedulaEmpleado = cedulaEmpleado;
	}

	public TipoVacuna getIdTipoVacuna() {
		return idTipoVacuna;
	}

	public void setIdTipoVacuna(TipoVacuna idTipoVacuna) {
		this.idTipoVacuna = idTipoVacuna;
	}

	public Date getFechaVacunacion() {
		return fechaVacunacion;
	}

	public void setFechaVacunacion(Date fechaVacunacion) {
		this.fechaVacunacion = fechaVacunacion;
	}

	public Integer getNroDosisVacunacion() {
		return nroDosisVacunacion;
	}

	public void setNroDosisVacunacion(Integer nroDosisVacunacion) {
		this.nroDosisVacunacion = nroDosisVacunacion;
	}

	public Empleado getIdEmpleado() {
		return idEmpleado;
	}

	public void setIdEmpleado(Empleado idEmpleado) {
		this.idEmpleado = idEmpleado;
	}

}
