package com.kiravl.models;

import java.time.LocalDateTime;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.persistence.Table;

@Entity
@Table(name = "niveles")
public class Nivel {

	@Id
	@Column(columnDefinition = "BIGINT(11) UNSIGNED")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	private boolean activo;
	
	@Column(length = 100, unique = true)
	private String nombre;
	
	@Column(updatable = false)
	private LocalDateTime createdAt;
	
	private LocalDateTime updateddAt;
	
	@OneToMany(mappedBy = "nivel")
	private List<Usuario> usuarios;
	
	@PrePersist
	@PreUpdate
	public void pre() {
		this.createdAt = LocalDateTime.now();
		this.updateddAt = LocalDateTime.now();
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public boolean isActivo() {
		return activo;
	}

	public void setActivo(boolean activo) {
		this.activo = activo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public LocalDateTime getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(LocalDateTime createdAt) {
		this.createdAt = createdAt;
	}

	public LocalDateTime getUpdateddAt() {
		return updateddAt;
	}

	public void setUpdateddAt(LocalDateTime updateddAt) {
		this.updateddAt = updateddAt;
	}

	public List<Usuario> getUsuarios() {
		return usuarios;
	}

	public void setUsuarios(List<Usuario> usuarios) {
		this.usuarios = usuarios;
	}
	
}
