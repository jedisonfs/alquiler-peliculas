package com.example.alquilerpeliculas.domain;

import java.io.Serializable;
import java.sql.Date;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "alquiler")
public class Alquiler implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id_alquiler")
	private Integer idAlquiler;

	@Column(name = "fech_alquiler")
	private Date fechAlquiler;

	@Column(name = "fech_devolucion")
	private Date fechDevolucion;

	@OneToOne
	@JoinColumn(columnDefinition = "fk_id_cliente", nullable = false, referencedColumnName = "id_cliente")
	private ClienteEntity idCliente;

	@OneToOne(optional = false)
	@JoinColumn(name = "fk_id_inventario", foreignKey = @ForeignKey(name = "fk_id_inventario"), referencedColumnName = "id_inventario")
	private InventarioEntity idInventario;

	public Integer getidAlquiler() {
		return idAlquiler;
	}

	public void setidAlquiler(Integer idAlquiler) {
		this.idAlquiler = idAlquiler;
	}

	public Date getFechAlquiler() {
		return fechAlquiler;
	}

	public void setFechAlquiler(Date fechAlquiler) {
		this.fechAlquiler = fechAlquiler;
	}

	public Date getFechDevolucion() {
		return fechDevolucion;
	}

	public void setFechDevolucion(Date fechDevolucion) {
		this.fechDevolucion = fechDevolucion;
	}

	public ClienteEntity getIdCliente() {
		return idCliente;
	}

	public void setIdCliente(ClienteEntity idCliente) {
		this.idCliente = idCliente;
	}

	public InventarioEntity getIdInventario() {
		return idInventario;
	}

	public void setIdInventario(InventarioEntity idInventario) {
		this.idInventario = idInventario;
	}

	@Override
	public int hashCode() {
		return Objects.hash(idAlquiler, fechAlquiler, fechDevolucion, idCliente, idInventario);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Alquiler other = (Alquiler) obj;
		return Objects.equals(idAlquiler, other.idAlquiler) && Objects.equals(fechAlquiler, other.fechAlquiler)
				&& Objects.equals(fechDevolucion, other.fechDevolucion) && Objects.equals(idCliente, other.idCliente)
				&& Objects.equals(idInventario, other.idInventario);
	}

}
