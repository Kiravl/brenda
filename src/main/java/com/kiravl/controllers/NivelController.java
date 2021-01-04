package com.kiravl.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kiravl.models.Nivel;
import com.kiravl.services.NivelService;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/api/nivel")
public class NivelController {
	
	@Autowired private NivelService nivelSrv;
	
	@GetMapping("/listar")
	public ResponseEntity<?> listar() {
		return ResponseEntity.ok(this.nivelSrv.listar());
	}
	
	@GetMapping("/activos")
	public ResponseEntity<?> activos() {
		return ResponseEntity.ok(this.nivelSrv.listar());
	}
	
	@GetMapping("/{id}") // localhost:8080/api/nivel/1
	public ResponseEntity<?> get(@PathVariable long id) {
		return ResponseEntity.ok(this.nivelSrv.get(id));
	}
	
	@PostMapping("/guardar")
	public ResponseEntity<?> guardar(@RequestBody Nivel nivel) {
		return ResponseEntity.ok(this.nivelSrv.guardar(nivel));
	}
	
	@DeleteMapping("/{id}") // localhost:8080/api/nivel/1
	public ResponseEntity<?> borrar(@PathVariable long id) {
		return ResponseEntity.ok(this.nivelSrv.borrar(id));
	}

}
