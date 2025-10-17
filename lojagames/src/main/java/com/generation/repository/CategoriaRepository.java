package com.generation.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.generation.model.Categoria;

public interface CategoriaRepository extends JpaRepository<Categoria, Long> {

	List<Categoria> findAllByNomeContainingIgnoreCase(String nome);
	Optional<Categoria>findByNomeIgnoreCase(String nome);
	
}
