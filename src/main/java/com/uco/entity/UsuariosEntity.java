package com.uco.entity;

import java.io.Serializable;

import javax.persistence.*;

@Entity
@Table(name="bdusuarios")
public class UsuariosEntity implements Serializable {
	private static final long serialVersionUID = -2343243243242432351L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_usuario", unique=true, nullable=false, insertable=false)
	private Long idUsuario;
	
	@Column(name="nombre")
	private String nombre;
	
	@Column(name="apellido")
	private String apellido;
	
	@Column(name="cedula")
	private int cedula;
	
	@Column(name="placa")
	private String placa;
	
	@Column(name="vehiculo")
	private String vehiculo;
	
	@Column(name="idhexrfid")
	private String idhexrfid;
	
	@Column(name="iddecrfid")
	private String iddecrfid;

	public UsuariosEntity() {
		super();
	}

	public UsuariosEntity(Long idUsuario, String nombre, String apellido, int cedula, String placa, String vehiculo,
			String idhexrfid, String iddecrfid) {
		super();
		this.idUsuario = idUsuario;
		this.nombre = nombre;
		this.apellido = apellido;
		this.cedula = cedula;
		this.placa = placa;
		this.vehiculo = vehiculo;
		this.idhexrfid = idhexrfid;
		this.iddecrfid = iddecrfid;
	}

	public Long getIdUsuario() {
		return idUsuario;
	}

	public void setIdUsuario(Long idUsuario) {
		this.idUsuario = idUsuario;
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

	public int getCedula() {
		return cedula;
	}

	public void setCedula(int cedula) {
		this.cedula = cedula;
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

	public String getIdhexrfid() {
		return idhexrfid;
	}

	public void setIdhexrfid(String idhexrfid) {
		this.idhexrfid = idhexrfid;
	}

	public String getIddecrfid() {
		return iddecrfid;
	}

	public void setIddecrfid(String iddecrfid) {
		this.iddecrfid = iddecrfid;
	}

	

}
