package com.jaegerdos.jaegerdos;

import java.io.IOException;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	@RequestMapping("/")
	public String index() {
		return "Index servicio dos";
	}
	
	@SuppressWarnings("unused")
	@RequestMapping("/dos")
	public String dos() throws IOException{
		if(true) {
			throw new IOException();
		}
		return "Hola mundo";
	}
}
