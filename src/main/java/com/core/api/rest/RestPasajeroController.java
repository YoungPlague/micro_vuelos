package com.core.api.rest;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.core.api.model.Pasajero;
import com.core.api.repository.IPasajeroRepository;

@RestController
@RequestMapping("/pasajeros")
public class RestPasajeroController {

	@Autowired
	private IPasajeroRepository repo;
	
	@GetMapping
	public List<Pasajero> listar(){
		return repo.findAll();
	}
	
	@GetMapping (value = "filtrarId/{id}")
	public Optional<Pasajero> filtrarId(@PathVariable Long id) {
		return repo.findById(id);
	}
	
	@PostMapping
	public void insertar(@RequestBody Pasajero pas){
		repo.save(pas);
	}
	
	@PutMapping
	public void modificar(@RequestBody Pasajero pas){
		repo.save(pas);
	}
	
	@DeleteMapping(value = "delete/{id}")
	public void eliminar(@PathVariable("id") Long id) {
		repo.deleteById(id);
	}
}