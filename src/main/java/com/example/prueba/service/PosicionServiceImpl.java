package com.example.prueba.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.prueba.entity.Posicion;
import com.example.prueba.repository.PosicionesRepository;

@Service
public class PosicionServiceImpl implements PosicionService{
	
	@Autowired
	private PosicionesRepository repository;

	@Override
	public List<Posicion> listarTodasLasPosiciones() {
		return repository.findByOrderByNombreAsc();
	}

}
