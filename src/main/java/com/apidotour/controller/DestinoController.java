package com.apidotour.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.apidotour.model.Destino;
import com.apidotour.service.DestinoService;

@RestController
@RequestMapping("/destino")
public class DestinoController {

	
	@Autowired
	private DestinoService destinoService;
	
	
	@PostMapping("/savedestino")
	public Destino Registrar(@RequestBody Destino destino) {
		return destinoService.saveDestino(destino);
	}
	
	@GetMapping("/alldestinos")
	public List<Destino> Listar() {
		return destinoService.getAllDestinos();
	}
	
	
	@GetMapping("/{id}")
	public ResponseEntity<Destino> Buscar(@PathVariable Long id) {
	    Destino destino = destinoService.getDestinoById(id);
	    return ResponseEntity.ok(destino);
	}
}
