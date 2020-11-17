package com.core.api.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Pasajero {
	
	@Id
	private long idPasajero;
	
	@Column(name="idVuelo_Pasajero")
	private long idVuelo_Pasajero;
	
	private String nombre;
	
	private String apellido;
	
	private String nacionalidad;
	
	private String tipoIdentificacion;
	
	private long numeroIdentificacion;

	public long getIdPasajero() {
		return idPasajero;
	}

	public void setIdPasajero(long idPasajero) {
		this.idPasajero = idPasajero;
	}

	public long getIdVuelo_Pasajero() {
		return idVuelo_Pasajero;
	}

	public void setIdVuelo_Pasajero(long idVuelo_Pasajero) {
		this.idVuelo_Pasajero = idVuelo_Pasajero;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getNacionalidad() {
		return nacionalidad;
	}

	public void setNacionalidad(String nacionalidad) {
		this.nacionalidad = nacionalidad;
	}

	public String getTipoIdentificacion() {
		return tipoIdentificacion;
	}

	public void setTipoIdentificacion(String tipoIdentificacion) {
		this.tipoIdentificacion = tipoIdentificacion;
	}

	public long getNumeroIdentificacion() {
		return numeroIdentificacion;
	}

	public void setNumeroIdentificacion(long numeroIdentificacion) {
		this.numeroIdentificacion = numeroIdentificacion;
	}
	
}