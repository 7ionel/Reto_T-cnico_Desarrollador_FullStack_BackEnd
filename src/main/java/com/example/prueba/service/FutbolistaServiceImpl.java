package com.example.prueba.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.prueba.entity.Futbolista;
import com.example.prueba.repository.FutbolistaRepository;

@Service
public class FutbolistaServiceImpl implements FutbolistaService{
	
	@Autowired
	private FutbolistaRepository repository;

	@Override
	public List<Futbolista> listaTodosLosFutbolistas() {
		return repository.findByOrderByIdAsc();
	}

	@Override
	public List<Futbolista>listaFutbolistaXPosicion(int idposicion) {
		return repository.listaFutbolistasXPosiciones(idposicion);
	}

}
