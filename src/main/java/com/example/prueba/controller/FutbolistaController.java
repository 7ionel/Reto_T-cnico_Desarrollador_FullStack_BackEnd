package com.example.prueba.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.prueba.entity.Futbolista;
import com.example.prueba.entity.Posicion;
import com.example.prueba.service.FutbolistaService;
import com.example.prueba.service.PosicionService;
import com.example.prueba.util.AppSettings;

@RestController
@RequestMapping("/url/consultaFutbolista")
@CrossOrigin(origins = AppSettings.URL_CROSS_ORIGIN)
public class FutbolistaController {
	
	//Listado Para las Posicion
	@Autowired
	private PosicionService posicionesService;
	
	@Autowired
	private FutbolistaService futbolistaService;
	
	
	@GetMapping("/listaPosiciones")
	@ResponseBody
	public List<Posicion> listaPosiciones() {
		return posicionesService.listarTodasLasPosiciones();
	}
	
	@GetMapping("/listaFutbolistas")
	@ResponseBody
	public ResponseEntity<List<Futbolista>> listaFutbolistas(){
		List<Futbolista> lista = futbolistaService.listaTodosLosFutbolistas();
		return ResponseEntity.ok(lista);
	}
	
		//Listado para los futbolistas por posiciones
		@GetMapping("/listaFutbolistasXPosiciones/{var}")
		@ResponseBody
		public ResponseEntity<?> listaFutbolistasXPosiciones(@PathVariable("var")int idposicion){
			List<Futbolista> lstSalida = null;
			
			if(idposicion == -1) {
				lstSalida = futbolistaService.listaTodosLosFutbolistas();
			}else {
				lstSalida = futbolistaService.listaFutbolistaXPosicion(idposicion);
			} 
			return ResponseEntity.ok(lstSalida);
		}
	
}
