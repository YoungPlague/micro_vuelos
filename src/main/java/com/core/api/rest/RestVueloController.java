package com.core.api.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.core.api.model.Vuelo;
import com.core.api.repository.IVueloRepository;

@RestController
@RequestMapping("/vuelos")
public class RestVueloController {

	@Autowired
	private IVueloRepository repoVuelo;
	
	@GetMapping
	public List<Vuelo> listar(){
		return repoVuelo.findAll();
	}
	
	@PostMapping
	public void insertar(@RequestBody Vuelo v){
		repoVuelo.save(v);
	}
	
	@PutMapping
	public void modificar(@RequestBody Vuelo v){
		repoVuelo.save(v);
	}
	
	@DeleteMapping(value = "delete/{id}")
	public void eliminar(@PathVariable("id") Long id) {
		repoVuelo.deleteById(id);
	}
}