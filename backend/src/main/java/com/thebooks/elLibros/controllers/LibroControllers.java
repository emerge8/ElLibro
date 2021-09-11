package com.thebooks.elLibros.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.thebooks.elLibros.dto.LibroDTO;
import com.thebooks.elLibros.services.LibroService;

@RestController
@RequestMapping(value = "/libros")
public class LibroControllers {

	@Autowired
	private LibroService service;

	@GetMapping
	public ResponseEntity<List<LibroDTO>> findAll() {
		List<LibroDTO> list = service.findAll();
		return ResponseEntity.ok().body(list);
	}
}
