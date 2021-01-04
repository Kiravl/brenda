package com.kiravl.models;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "usuarios")
public class Usuario {
	
	@Id
	@Column(columnDefinition = "BIGINT(11) UNSIGNED")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	private boolean activo;
	
	@Column(length = 45, updatable = false)
	private String username;
	
	@Column(insertable = false)
	private LocalDateTime deletedAt;
	
	@Column(updatable = false)
	private LocalDateTime createdAt;
	
	private LocalDateTime updateddAt;
	
	@JsonIgnoreProperties({"usuarios"})
	@ManyToOne
	private Nivel nivel;

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

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public LocalDateTime getDeletedAt() {
		return deletedAt;
	}

	public void setDeletedAt(LocalDateTime deletedAt) {
		this.deletedAt = deletedAt;
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

	public Nivel getNivel() {
		return nivel;
	}

	public void setNivel(Nivel nivel) {
		this.nivel = nivel;
	}

}
