package com.example.alquilerpeliculas.controller;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.alquilerpeliculas.dto.AlquilerDto;
import com.example.alquilerpeliculas.service.IAlquilerService;

@RestController
@RequestMapping("alquiler/")
public class AlquilerController {

	@Autowired
	private IAlquilerService alquilerService;

	@GetMapping("fecha-devolucion/{fechDevolucion}")
	public ResponseEntity<List<AlquilerDto>> findByFechaDevolucion(
			@PathVariable @DateTimeFormat(pattern = "yyyy-MM-dd") Date fechDevolucion) {

		return ResponseEntity.ok(alquilerService.findByFechDevolucion(fechDevolucion));
	}
}
