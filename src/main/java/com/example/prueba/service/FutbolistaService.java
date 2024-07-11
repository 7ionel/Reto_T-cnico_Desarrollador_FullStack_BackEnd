package com.example.prueba.service;

import java.util.List;

import com.example.prueba.entity.Futbolista;

public interface FutbolistaService {
	public abstract List<Futbolista> listaTodosLosFutbolistas();
	public abstract List<Futbolista> listaFutbolistaXPosicion(int idposicion);
}
