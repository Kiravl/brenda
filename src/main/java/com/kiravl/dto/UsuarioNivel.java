package com.kiravl.dto;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import com.kiravl.models.Usuario;

public class UsuarioNivel {

	private String nombre;
	private String NombreNivel;
	private LocalDateTime fechaAlta;
	private BigDecimal sueldo;
	
	public UsuarioNivel(Usuario x) {
		this.nombre = x.getUsername();
		this.NombreNivel = x.getUsername() + x.getNivel().getNombre();
		this.fechaAlta = x.getCreatedAt();
		this.sueldo = BigDecimal.ZERO;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getNombreNivel() {
		return NombreNivel;
	}

	public void setNombreNivel(String nombreNivel) {
		NombreNivel = nombreNivel;
	}

	public LocalDateTime getFechaAlta() {
		return fechaAlta;
	}

	public void setFechaAlta(LocalDateTime fechaAlta) {
		this.fechaAlta = fechaAlta;
	}

	public BigDecimal getSueldo() {
		return sueldo;
	}

	public void setSueldo(BigDecimal sueldo) {
		this.sueldo = sueldo;
	}

}
