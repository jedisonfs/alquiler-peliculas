package com.example.alquilerpeliculas.mapper;

import org.mapstruct.InheritConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.springframework.stereotype.Component;

import com.example.alquilerpeliculas.domain.Alquiler;
import com.example.alquilerpeliculas.dto.AlquilerDto;

@Component
@Mapper(componentModel = "spring")
public interface IAlquilerMapper {

	@Mapping(source = "alquiler.idAlquiler", target = "idAlquiler")
	@Mapping(source = "fechAlquiler", target = "fechaAlquiler")
	@Mapping(source = "fechDevolucion", target = "fechaDevolucion")
	@Mapping(source = "alquiler.idInventario.disponible", target = "disponible")
	@Mapping(source = "alquiler.idInventario.idPelicula.nombre", target = "pelicula")
	AlquilerDto toAlquilerDto(Alquiler alquiler);

	@InheritConfiguration
	Alquiler toAlquiler(AlquilerDto alquilerDTO);
}
