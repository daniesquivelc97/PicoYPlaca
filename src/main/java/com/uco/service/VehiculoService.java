package com.uco.service;

import java.util.List;

import com.uco.entity.VehiculoEntity;

public interface VehiculoService {
	
	public List<VehiculoEntity> getVehiculos();
	
	public VehiculoEntity getVehiculo(Long idVehiculo);
	
	public VehiculoEntity crearVehiculo(VehiculoEntity vehiculoEntity);
	
	public VehiculoEntity modificarVehiculo(VehiculoEntity vehiculoEntity);
	
	public void eliminarVehiculo(Long idVehiculo);

}
