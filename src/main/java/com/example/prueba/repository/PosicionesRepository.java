package com.example.prueba.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.prueba.entity.Posicion;

public interface PosicionesRepository extends JpaRepository<Posicion, Integer>{
	public abstract List<Posicion> findByOrderByNombreAsc();
}
