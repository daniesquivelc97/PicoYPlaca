package com.uco.service;

import java.util.List;

import com.uco.entity.VehiculoEntity;
import com.uco.entity.UsuariosEntity;

public interface UsuariosService {
	
	public UsuariosEntity getUsuario(Long idUsuario);
	
	public UsuariosEntity getUsuarioByNumeroIdentificacion(int numeroIdentificacion);
	
	public List<UsuariosEntity> getUsuario();
	
	public UsuariosEntity crearUsuario(UsuariosEntity usuariosEntity);
	
	public UsuariosEntity modificarUsuario(UsuariosEntity usuariosEntity);
	
	public void eliminarUsuario(Long idUsuario);
	
	public VehiculoEntity crearUsuarioYVehiculo(UsuariosEntity usuariosEntity, VehiculoEntity vehiculoEntity);

}
