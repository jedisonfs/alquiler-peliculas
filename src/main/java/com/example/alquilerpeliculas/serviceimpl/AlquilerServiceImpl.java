package com.example.alquilerpeliculas.serviceimpl;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.alquilerpeliculas.domain.Alquiler;
import com.example.alquilerpeliculas.dto.AlquilerDto;
import com.example.alquilerpeliculas.mapper.IAlquilerMapper;
import com.example.alquilerpeliculas.repository.IAlquilerRepository;
import com.example.alquilerpeliculas.service.IAlquilerService;

@Component
public class AlquilerServiceImpl implements IAlquilerService {

	@Autowired
	private IAlquilerMapper mapper;
	@Autowired
	private IAlquilerRepository alquilerRepo;

	@Override
	public List<AlquilerDto> findByFechDevolucion(Date fechDevolucion) {
		List<AlquilerDto> listDto = new ArrayList<>();

		for (Alquiler alquilar : alquilerRepo.findByFechDevolucion(new java.sql.Date(fechDevolucion.getTime()))) {
			listDto.add(mapper.toAlquilerDto(alquilar));
		}

		return listDto;
	}

}
