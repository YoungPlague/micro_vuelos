package com.core.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.core.api.model.Pasajero;
import com.core.api.repository.IPasajeroRepository;

@Controller
public class PasajeroController {

	@Autowired
	private IPasajeroRepository repo;
	
	@GetMapping("/inserccion/pasajero")
	public String greeting(@RequestParam(name="name", required=false, defaultValue="Passenger") String name, Model model) {
		
		Pasajero pasajero = new Pasajero();
		pasajero.setIdPasajero(1);
		pasajero.setIdVuelo_Pasajero(1);
		pasajero.setNombre("Alejandro");
		pasajero.setApellido("Ramirez");
		pasajero.setNacionalidad("Colombiano");
		pasajero.setTipoIdentificacion("Cc");
		pasajero.setNumeroIdentificacion(1000441523);
		
		model.addAttribute("name", name);
		
		repo.save(pasajero);
		return "pasajeros";
	}
	
	@GetMapping("/listar")
	public String greeting(Model model) {
		model.addAttribute("pasajeros", repo.findAll());
		return "pasajeros";
	}
}