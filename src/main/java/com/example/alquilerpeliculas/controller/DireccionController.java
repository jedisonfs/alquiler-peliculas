package com.example.alquilerpeliculas.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.alquilerpeliculas.dto.DireccionDto;
import com.example.alquilerpeliculas.service.IDireccionService;

@RestController
@RequestMapping("direccion/")
public class DireccionController {

	@Autowired
	private IDireccionService direccionService;

	public ResponseEntity<DireccionDto> insertDireccion(@Valid @RequestBody DireccionDto direccionDto) {
		return ResponseEntity.ok(direccionDto);
	}
}
