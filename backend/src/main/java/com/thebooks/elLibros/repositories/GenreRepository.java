package com.thebooks.elLibros.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.thebooks.elLibros.entities.Genre;

public interface GenreRepository extends JpaRepository<Genre, Long> {

}
