package com.example.alquilerpeliculas.domain;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "inventario")
public class InventarioEntity implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id_inventario")
	private Integer idInventario;

	private Integer disponible;

	@NotNull
	@ManyToOne(optional = false)
	@JoinColumn(name = "fk_id_pelicula", foreignKey = @ForeignKey(name = "fk_id_pelicula"), referencedColumnName = "id_pelicula")
	private PeliculaEntity idPelicula;

	public Integer getIdInventario() {
		return idInventario;
	}

	public void setIdInventario(Integer idInventario) {
		this.idInventario = idInventario;
	}

	public Integer getDisponible() {
		return disponible;
	}

	public void setDisponible(Integer disponible) {
		this.disponible = disponible;
	}

	public PeliculaEntity getIdPelicula() {
		return idPelicula;
	}

	public void setIdPelicula(PeliculaEntity idPelicula) {
		this.idPelicula = idPelicula;
	}

	@Override
	public int hashCode() {
		return Objects.hash(disponible, idInventario, idPelicula);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		InventarioEntity other = (InventarioEntity) obj;
		return Objects.equals(disponible, other.disponible) && Objects.equals(idInventario, other.idInventario)
				&& Objects.equals(idPelicula, other.idPelicula);
	}

}
