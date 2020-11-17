package com.core.api.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="informacion_vuelo")
public class Vuelo {
	
	@Id
	private long idVuelo;
	
	@Column
	private String modeloAvion;
	
	private String tipoVuelo;
	
	private long cantidadPasajeros;

	public long getIdVuelo() {
		return idVuelo;
	}

	public void setIdVuelo(long idVuelo) {
		this.idVuelo = idVuelo;
	}

	public String getModeloAvion() {
		return modeloAvion;
	}

	public void setModeloAvion(String modeloAvion) {
		this.modeloAvion = modeloAvion;
	}

	public String getTipoVuelo() {
		return tipoVuelo;
	}

	public void setTipoVuelo(String tipoVuelo) {
		this.tipoVuelo = tipoVuelo;
	}

	public long getCantidadPasajeros() {
		return cantidadPasajeros;
	}

	public void setCantidadPasajeros(long cantidadPasajeros) {
		this.cantidadPasajeros = cantidadPasajeros;
	}
	
}