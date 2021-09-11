package com.thebooks.elLibros.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.thebooks.elLibros.entities.Record;

@Repository
public interface RecordRepository extends JpaRepository<Record, Long> {

}
