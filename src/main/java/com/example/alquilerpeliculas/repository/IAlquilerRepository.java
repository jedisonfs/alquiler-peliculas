package com.example.alquilerpeliculas.repository;

import java.sql.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.alquilerpeliculas.domain.Alquiler;

@Repository
public interface IAlquilerRepository extends JpaRepository<Alquiler, Integer> {

	List<Alquiler> findByFechDevolucion(Date fechDevolucion);

}
