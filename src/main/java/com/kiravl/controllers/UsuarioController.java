package com.kiravl.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kiravl.models.Usuario;
import com.kiravl.services.UsuarioService;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/api/usuario")
public class UsuarioController {
	
	@Autowired private UsuarioService userSrv;

	@GetMapping("/listar")
	public ResponseEntity<?> listar(Pageable pageable) {
		return ResponseEntity.ok(this.userSrv.listar(pageable));
	}
	
	
	@GetMapping("/{id}") // localhost:8080/api/nivel/1
	public ResponseEntity<?> get(@PathVariable long id) {
		return ResponseEntity.ok(this.userSrv.get(id));
	}
	
	@PostMapping("/guardar")
	public ResponseEntity<?> guardar(@RequestBody Usuario nivel) {
		return ResponseEntity.ok(this.userSrv.guardar(nivel));
	}
	
	@DeleteMapping("/{id}") // localhost:8080/api/nivel/1
	public ResponseEntity<?> borrar(@PathVariable long id) {
		return ResponseEntity.ok(this.userSrv.borrar(id));
	}
}
