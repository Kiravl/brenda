package com.kiravl.services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.kiravl.dto.UsuarioNivel;
import com.kiravl.models.Usuario;
import com.kiravl.repositories.UsuarioRepository;

@Service
public class UsuarioService {
	
	@Autowired private UsuarioRepository userRep;
	
	public Page<Usuario> listar(Pageable pageable) {
		return this.userRep.findAll(pageable);
	}
	
	public List<UsuarioNivel> especial() {
		return this.userRep.findAll().stream().map(x -> new UsuarioNivel(x)).collect(Collectors.toList());
	}

	public Usuario get(long id) {
		return this.userRep.getOne(id);
	}

	public Usuario guardar(Usuario args) {
		return this.userRep.save(args);
	}

	public Usuario borrar(long id) {
		final Usuario nivel = this.userRep.getOne(id);
		nivel.setActivo(false);
		this.enviarCorreo();
		return this.userRep.save(nivel);
	}
	
	private void enviarCorreo() {
		/**
		 * 
		 */
	}

}
