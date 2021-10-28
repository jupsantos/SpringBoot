package com.helloworld.metas.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/meta")
public class MetasController {
	
	@GetMapping
	public String metas() {
		return "Estudar mais afundo Spring Boot | Colocar em prática SQL";
	}
}
