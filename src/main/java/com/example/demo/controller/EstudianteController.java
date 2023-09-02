package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.repository.modelo.Estudiante;
import com.example.demo.service.EstudianteService;

@Controller
@RequestMapping("/estudiantes")
public class EstudianteController {
	
	@Autowired
	EstudianteService estudianteService;
	
	
	@GetMapping("/vistaEstudiante")
	public String vistaEstudiante(Estudiante estudiante) {

		return "vistaInsertarEstudiante";
	}

	@PostMapping("/guardar")
	public String insertarEstudiante (Estudiante estudiante) {
		this.estudianteService.guardar(estudiante);
		return "redirect:/estudiantes/vistaEstudiante";
	}



}
