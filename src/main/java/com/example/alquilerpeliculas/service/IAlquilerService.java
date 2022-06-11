package com.example.alquilerpeliculas.service;

import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.alquilerpeliculas.dto.AlquilerDto;

@Service
public interface IAlquilerService {

	List<AlquilerDto> findByFechDevolucion(Date fechDevolucion);
}
