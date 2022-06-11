package com.example.alquilerpeliculas.domain;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name = "categoria")
public class Categoria implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id_categoria")
	private Integer idCategoria;

	@NotNull
	@Size(max = 45)
	private String nombre;

	@OneToOne(mappedBy = "idCategoria")
	private PeliculaEntity pelicula;

	public Integer getIdCategoria() {
		return idCategoria;
	}

	public void setIdCategoria(Integer idCategoria) {
		this.idCategoria = idCategoria;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public PeliculaEntity getPelicula() {
		return pelicula;
	}

	public void setPelicula(PeliculaEntity pelicula) {
		this.pelicula = pelicula;
	}

	@Override
	public int hashCode() {
		return Objects.hash(idCategoria, nombre, pelicula);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Categoria other = (Categoria) obj;
		return Objects.equals(idCategoria, other.idCategoria) && Objects.equals(nombre, other.nombre)
				&& Objects.equals(pelicula, other.pelicula);
	}

}
