package com.uco.entity;

import java.io.Serializable;

import javax.persistence.*;

@Entity
@Table(name="bdusuarios")
public class UsuariosEntity implements Serializable {
	private static final long serialVersionUID = -2343243243242432351L;
	
//	@GeneratedValue(strategy = GenerationType.IDENTITY)
//	@Column(name = "id_usuario", nullable=false, insertable=false)
//	private Long idUsuario;
	
	@Column(name="nombre")
	private String nombre;
	
	@Column(name="apellido")
	private String apellido;
	
	@Column(name="email")
	private String email;

	@Column(name="tipo_identificacion")
	private String tipoIdentificacion;
	
	@Id
	@Column(name="numero_identificacion", unique=true, nullable=false)
	private Long numeroIdentificacion;
	
	@Column(name="placa")
	private String placa;
	
	@Column(name="vehiculo")
	private String vehiculo;
	
	@Column(name="id_carnet")
	private String idCarnet;

	public UsuariosEntity() {
		super();
	}

	public UsuariosEntity(String nombre, String apellido, String email, String tipoIdentificacion,
			Long numeroIdentificacion, String placa, String vehiculo, String idCarnet) {
		super();
//		this.idUsuario = idUsuario;
		this.nombre = nombre;
		this.apellido = apellido;
		this.email = email;
		this.tipoIdentificacion = tipoIdentificacion;
		this.numeroIdentificacion = numeroIdentificacion;
		this.placa = placa;
		this.vehiculo = vehiculo;
		this.idCarnet = idCarnet;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTipoIdentificacion() {
		return tipoIdentificacion;
	}

	public void setTipoIdentificacion(String tipoIdentificacion) {
		this.tipoIdentificacion = tipoIdentificacion;
	}

	public Long getNumeroIdentificacion() {
		return numeroIdentificacion;
	}

	public void setNumeroIdentificacion(Long numeroIdentificacion) {
		this.numeroIdentificacion = numeroIdentificacion;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public String getVehiculo() {
		return vehiculo;
	}

	public void setVehiculo(String vehiculo) {
		this.vehiculo = vehiculo;
	}

	public String getIdCarnet() {
		return idCarnet;
	}

	public void setIdCarnet(String idCarnet) {
		this.idCarnet = idCarnet;
	}

}
