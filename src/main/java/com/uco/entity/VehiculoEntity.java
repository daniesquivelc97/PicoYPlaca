package com.uco.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.*;

@Entity
@Table(name="vehiculo")
public class VehiculoEntity implements Serializable {
	private static final long serialVersionUID = -2343243243242432351L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_vehiculo", unique=true, nullable=false, insertable=false)
	private Long idVehiculo;
	
	@ManyToOne
	@JoinColumn(name="id_usuario")
	private UsuariosEntity usuario;
	
	@Column(name="fecha_ingreso")
	private Date fechaIngreso;
	
	@Column(name="digito_verificacion", insertable=true)
	private Long digitoVerificacion;
	
	@Column(name="placa_vehiculo",insertable=true)
	private String placaVehiculo;
	
	@Column(name="tipo_vehiculo",insertable=true)
	private String tipoVehiculo;
	@PrePersist
	protected void onCreate() {
		fechaIngreso = new Date();
	}

	public VehiculoEntity() {
		super();
	}

	public VehiculoEntity(Long idVehiculo, UsuariosEntity usuario, Date fechaIngreso, Long digitoVerificacion,
			String placaVehiculo, String tipoVehiculo) {
		super();
		this.idVehiculo = idVehiculo;
		this.usuario = usuario;
		this.fechaIngreso = fechaIngreso;
		this.digitoVerificacion = digitoVerificacion;
		this.placaVehiculo = placaVehiculo;
		this.tipoVehiculo = tipoVehiculo;
	}

	public Long getIdVehiculo() {
		return idVehiculo;
	}

	public void setIdVehiculo(Long idVehiculo) {
		this.idVehiculo = idVehiculo;
	}

	public UsuariosEntity getUsuario() {
		return usuario;
	}

	public void setUsuario(UsuariosEntity usuario) {
		this.usuario = usuario;
	}

	public Date getFechaIngreso() {
		return fechaIngreso;
	}

	public void setFechaIngreso(Date fechaIngreso) {
		this.fechaIngreso = fechaIngreso;
	}

	public Long getDigitoVerificacion() {
		return digitoVerificacion;
	}

	public void setDigitoVerificacion(Long digitoVerificacion) {
		this.digitoVerificacion = digitoVerificacion;
	}

	public String getPlacaVehiculo() {
		return placaVehiculo;
	}

	public void setPlacaVehiculo(String placaVehiculo) {
		this.placaVehiculo = placaVehiculo;
	}
	
	public String getTipoVehiculo() {
		return tipoVehiculo;
	}

	public void setTipoVehiculo(String tipoVehiculo) {
		this.tipoVehiculo = tipoVehiculo;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
}
