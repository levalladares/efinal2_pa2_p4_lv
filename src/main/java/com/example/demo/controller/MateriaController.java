package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.repository.modelo.Materia;
import com.example.demo.service.MateriaService;

@Controller
@RequestMapping("/materias")
public class MateriaController {
	
	@Autowired
	MateriaService materiaService;
	
	@GetMapping("/vistaMateria")
	public String vistaEstudiante(Materia materia) {

		return "vistaInsertarMateria";
	}

	@PostMapping("/guardar")
	public String insertarEstudiante (Materia materia) {
		this.materiaService.guardar(materia);
		return "redirect:/materias/vistaMateria";
	}

}
