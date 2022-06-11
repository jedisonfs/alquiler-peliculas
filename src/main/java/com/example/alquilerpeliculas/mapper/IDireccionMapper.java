package com.example.alquilerpeliculas.mapper;

import org.mapstruct.InheritConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.springframework.stereotype.Component;

import com.example.alquilerpeliculas.domain.Direccion;
import com.example.alquilerpeliculas.dto.DireccionDto;

@Component
@Mapper(componentModel = "spring")
public interface IDireccionMapper {

	@Mapping(source = "idDireccion", target = "id")
	@Mapping(source = "direccion", target = "direccionResidencia")
	@Mapping(source = "ciudad", target = "ciudad")
	@Mapping(source = "pais", target = "pais")
	DireccionDto toDireccionDto(Direccion direccion);

	@InheritConfiguration
	Direccion toDireccion(DireccionDto direccionDto);
}
