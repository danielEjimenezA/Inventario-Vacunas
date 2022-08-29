package com.kruger.inventario.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class TipoVacuna {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idTipoVacuna;

	@Column
	private String nombreTipoVacuna;

	@OneToMany(cascade = CascadeType.ALL, mappedBy = "idTipoVacuna")
	private List<Vacunacion> vacunacionList;

	public Integer getIdTipoVacuna() {
		return idTipoVacuna;
	}

	public void setIdTipoVacuna(Integer idTipoVacuna) {
		this.idTipoVacuna = idTipoVacuna;
	}

	public String getNombreTipoVacuna() {
		return nombreTipoVacuna;
	}

	public void setNombreTipoVacuna(String nombreTipoVacuna) {
		this.nombreTipoVacuna = nombreTipoVacuna;
	}

}
