package com.example.alquilerpeliculas.dto;

import java.util.Objects;

public class DireccionDto {

	private int id;
	private String direccionResidencia;
	private String ciudad;
	private String pais;

	public int getid() {
		return id;
	}

	public void setid(int id) {
		this.id = id;
	}

	public String getdireccionResidencia() {
		return direccionResidencia;
	}

	public void setdireccionResidencia(String direccionResidencia) {
		this.direccionResidencia = direccionResidencia;
	}

	public String getCiudad() {
		return ciudad;
	}

	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}

	public String getPais() {
		return pais;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}

	@Override
	public int hashCode() {
		return Objects.hash(ciudad, direccionResidencia, id, pais);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		DireccionDto other = (DireccionDto) obj;
		return Objects.equals(ciudad, other.ciudad) && Objects.equals(direccionResidencia, other.direccionResidencia)
				&& id == other.id && Objects.equals(pais, other.pais);
	}

}
