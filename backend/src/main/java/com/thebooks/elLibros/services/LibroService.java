package com.thebooks.elLibros.services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.thebooks.elLibros.dto.LibroDTO;
import com.thebooks.elLibros.entities.Libro;
import com.thebooks.elLibros.repositories.LibroRepository;

@Service
public class LibroService {

	@Autowired
	private LibroRepository repository;
	
	@Transactional(readOnly = true)
	public List<LibroDTO> findAll(){
		List<Libro> list = repository.findAll();
		return list.stream().map(x -> new LibroDTO(x)).collect(Collectors.toList());
		
	}
}
