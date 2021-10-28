package com.helloworld.mentalidade.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/mentalidade")
public class HelloworldController {

	@GetMapping
	public String helloMentalidade() {
		return " - Persistência; " + "\n - Proatividade;" + "\n - Pensamento futuro;"
				+ "\n - Atenção aos detalhes.";
	}
	
}
