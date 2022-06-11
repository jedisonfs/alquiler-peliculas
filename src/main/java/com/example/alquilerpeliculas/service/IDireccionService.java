package com.example.alquilerpeliculas.service;

import org.springframework.stereotype.Service;

import com.example.alquilerpeliculas.domain.Direccion;
import com.example.alquilerpeliculas.dto.DireccionDto;

@Service
public interface IDireccionService {

	DireccionDto insertDireccion(DireccionDto direccionDTO);
}
