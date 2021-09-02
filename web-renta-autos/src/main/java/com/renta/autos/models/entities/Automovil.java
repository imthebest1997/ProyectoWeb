package com.renta.autos.models.entities;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;


@Entity
@Table(name = "automovil")
public class Automovil implements Serializable{

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Basic(optional = false)
	@Column(name = "codigo_aut")
	private Integer codigoAutomovil;//Atributo que se mapea con la Primary Key

	@Column(name = "disponibilidad_aut")
	private boolean disponibilidad;
	
	@Column(name = "tipo_auto_aut")
	private String tipoAuto;

	@Column(name = "numero_placa_aut")
	private String numeroPlaca;
	
	@Column(name = "marca_aut")
	private String marca;

	@Column(name = "color_aut")
	private String color;

	@OneToMany(mappedBy = "automovil", fetch = FetchType.LAZY)
	private List<Mantenimiento> mantenimiento;

	@OneToMany(mappedBy = "automovil", fetch = FetchType.LAZY)
	private List<Accesorios> listaAccesorios;

	public Automovil(Integer codigoAutomovil) {
		super();
		this.codigoAutomovil = codigoAutomovil;
	}
	
	public Automovil() {
		super();
	}

	public Integer getCodigoAuto() {
		return codigoAutomovil;
	}

	public void setCodigoAuto(Integer codigoAuto) {
		this.codigoAutomovil = codigoAuto;
	}

	public boolean isDisponible() {
		return disponibilidad;
	}

	public void setDisponible(boolean disponibilidad) {
		this.disponibilidad = disponibilidad;
	}


	public String getTipoAuto() {
		return tipoAuto;
	}

	public void setTipoAuto(String tipoAuto) {
		this.tipoAuto = tipoAuto;
	}

	public String getNumPlaca() {
		return numeroPlaca;
	}

	public void setNumPlaca(String numPlaca) {
		this.numeroPlaca = numPlaca;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public boolean isDisponibilidad() {
		return disponibilidad;
	}

	public void setDisponibilidad(boolean disponibilidad) {
		this.disponibilidad = disponibilidad;
	}

	public String getNumeroPlaca() {
		return numeroPlaca;
	}

	public void setNumeroPlaca(String numeroPlaca) {
		this.numeroPlaca = numeroPlaca;
	}

	public Integer getCodigoAutomovil() {
		return codigoAutomovil;
	}

	public void setCodigoAutomovil(Integer codigoAutomovil) {
		this.codigoAutomovil = codigoAutomovil;
	}

	public List<Mantenimiento> getMantenimiento() {
		return mantenimiento;
	}

	public void setMantenimiento(List<Mantenimiento> mantenimiento) {
		this.mantenimiento = mantenimiento;
	}

	public List<Accesorios> getListaAccesorios() {
		return listaAccesorios;
	}

	public void setListaAccesorios(List<Accesorios> listaAccesorios) {
		this.listaAccesorios = listaAccesorios;
	}
	
}
