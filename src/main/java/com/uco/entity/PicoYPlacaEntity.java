package com.uco.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.*;

@Entity
@Table(name="picoyplaca")
public class PicoYPlacaEntity implements Serializable {

	private static final long serialVersionUID = 3911748245223240137L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_picoyplaca", nullable=false, insertable=false)
	private Long idPicoYPlaca;
	
	@Column(name="fecha_inicio")
	private Date fechaInicio;
	
	@Column(name="fecha_fin")
	private Date fechaFin;

	@Column(name="activo")
	private Boolean activo;

	public PicoYPlacaEntity() {
		super();
	}

	public PicoYPlacaEntity(Long idPicoYPlaca, Date fechaInicio, Date fechaFin, Boolean activo) {
		super();
		this.idPicoYPlaca = idPicoYPlaca;
		this.fechaInicio = fechaInicio;
		this.fechaFin = fechaFin;
		this.activo = activo;
	}

	public Long getIdPicoYPlaca() {
		return idPicoYPlaca;
	}

	public void setIdPicoYPlaca(Long idPicoYPlaca) {
		this.idPicoYPlaca = idPicoYPlaca;
	}

	public Date getFechaInicio() {
		return fechaInicio;
	}

	public void setFechaInicio(Date fechaInicio) {
		this.fechaInicio = fechaInicio;
	}

	public Date getFechaFin() {
		return fechaFin;
	}

	public void setFechaFin(Date fechaFin) {
		this.fechaFin = fechaFin;
	}

	public Boolean getActivo() {
		return activo;
	}

	public void setActivo(Boolean activo) {
		this.activo = activo;
	}
	
}
