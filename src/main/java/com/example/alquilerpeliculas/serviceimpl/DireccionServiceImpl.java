package com.example.alquilerpeliculas.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.alquilerpeliculas.domain.Direccion;
import com.example.alquilerpeliculas.dto.DireccionDto;
import com.example.alquilerpeliculas.mapper.IDireccionMapper;
import com.example.alquilerpeliculas.repository.IDireccionRepository;
import com.example.alquilerpeliculas.service.IDireccionService;

public class DireccionServiceImpl implements IDireccionService {

	@Autowired
	private IDireccionRepository dirRepo;
	@Autowired
	private IDireccionMapper mapper;

	@Override
	public DireccionDto insertDireccion(DireccionDto direccionDto) {
		return mapper.toDireccionDto(dirRepo.save(mapper.toDireccion(direccionDto)));
	}

}
