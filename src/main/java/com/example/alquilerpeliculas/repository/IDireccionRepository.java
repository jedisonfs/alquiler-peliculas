package com.example.alquilerpeliculas.repository;

import javax.persistence.criteria.CriteriaBuilder.In;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.alquilerpeliculas.domain.Direccion;

@Repository
public interface IDireccionRepository extends JpaRepository<Direccion, Integer> {

}
