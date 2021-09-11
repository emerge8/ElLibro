package com.thebooks.elLibros.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.thebooks.elLibros.entities.Libro;

@Repository
public interface LibroRepository extends JpaRepository<Libro, Long> {

}
