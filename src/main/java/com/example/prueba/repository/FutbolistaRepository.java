package com.example.prueba.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.prueba.entity.Futbolista;


public interface FutbolistaRepository extends JpaRepository<Futbolista, Integer>{
	
	public abstract List<Futbolista> findByOrderByIdAsc();
	
	@Query("select f from Futbolista f where f.posicion.idposicion =?1")
	public abstract List<Futbolista> listaFutbolistasXPosiciones(int idposicion);
}
