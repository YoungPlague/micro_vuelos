package com.core.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.core.api.model.Vuelo;
import com.core.api.repository.IVueloRepository;

@Controller
public class VueloController {

	@Autowired
	private IVueloRepository repoVuelo;
	
	@GetMapping("/inserccion/vuelo")
    public String greeting(@RequestParam(name="name", required=false, defaultValue="Passenger") String name, Model model) {
		
		Vuelo vuelo = new Vuelo();
		vuelo.setIdVuelo(1);
		vuelo.setModeloAvion("Airbus A320");
		vuelo.setTipoVuelo("Comercial");
		vuelo.setCantidadPasajeros(10);;
		
		model.addAttribute("name", name);
		repoVuelo.save(vuelo);
		
		return "vuelos";
	}
	
	@GetMapping("/listar/vuelos")
	public String greeting(Model model) {
		model.addAttribute("vuelos", repoVuelo.findAll());
		return "vuelos";
	}
}
