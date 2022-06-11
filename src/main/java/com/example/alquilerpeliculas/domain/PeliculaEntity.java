package com.example.alquilerpeliculas.domain;

import java.io.Serializable;
import java.util.List;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name = "pelicula")
public class PeliculaEntity implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id_pelicula")
	private Integer idPelicula;

	@NotNull
	@Size(max = 45)
	private String nombre;

	@NotNull
	private Integer duracion;
	private String descripcion;

	@NotNull
	private Integer año;

	@NotNull
	@OneToOne
	@JoinColumn(name = "id_categoria", foreignKey = @ForeignKey(name = "fk_id_categoria"), referencedColumnName = "id_categoria")
	private CategoriaEntity idCategoria;

	@OneToMany(mappedBy = "idPelicula")
	private List<InventarioEntity> inventario;

	public Integer getIdPelicula() {
		return idPelicula;
	}

	public void setIdPelicula(Integer idPelicula) {
		this.idPelicula = idPelicula;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Integer getDuracion() {
		return duracion;
	}

	public void setDuracion(Integer duracion) {
		this.duracion = duracion;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public Integer getAño() {
		return año;
	}

	public void setAño(Integer año) {
		this.año = año;
	}

	public CategoriaEntity getIdCategoria() {
		return idCategoria;
	}

	public void setIdCategoria(CategoriaEntity idCategoria) {
		this.idCategoria = idCategoria;
	}

	@Override
	public int hashCode() {
		return Objects.hash(año, descripcion, duracion, idCategoria, idPelicula, nombre);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		PeliculaEntity other = (PeliculaEntity) obj;
		return Objects.equals(año, other.año) && Objects.equals(descripcion, other.descripcion)
				&& Objects.equals(duracion, other.duracion) && Objects.equals(idCategoria, other.idCategoria)
				&& Objects.equals(idPelicula, other.idPelicula) && Objects.equals(nombre, other.nombre);
	}

}
