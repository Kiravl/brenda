package com.kiravl.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kiravl.models.Nivel;
import com.kiravl.repositories.NivelRepository;

@Service
public class NivelServiceImp implements NivelService {
	
	@Autowired private NivelRepository nivelRep;

	@Override
	public List<Nivel> listar() {
		return this.nivelRep.findAll();
	}

	@Override
	public Nivel get(long id) {// jackson
		return this.nivelRep.getOne(id);
	}

	@Override
	public Nivel guardar(Nivel args) {
		return this.nivelRep.save(args);
	}

	@Override
	public Nivel borrar(long id) {
		final Nivel nivel = this.nivelRep.getOne(id);
		nivel.setActivo(false);
		return this.nivelRep.save(nivel);
	}

}
