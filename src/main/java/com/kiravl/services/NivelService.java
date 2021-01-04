package com.kiravl.services;

import java.util.List;

import com.kiravl.models.Nivel;

public interface NivelService {
	
	public List<Nivel> listar();
	public Nivel get(long id);
	public Nivel guardar(Nivel args);
	public Nivel borrar(long id);

}
