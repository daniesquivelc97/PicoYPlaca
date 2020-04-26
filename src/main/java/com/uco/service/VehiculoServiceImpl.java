package com.uco.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.uco.entity.VehiculoEntity;
import com.uco.repository.VehiculoRepository;

@Service
@Transactional
public class VehiculoServiceImpl implements VehiculoService{
	
	@Autowired
	private VehiculoRepository vehiculoRepository;

	@Override
	public List<VehiculoEntity> getVehiculos() {
		return (List<VehiculoEntity>) vehiculoRepository.findAll();
	}

	@Override
	public VehiculoEntity getVehiculo(Long idVehiculo) {
		return vehiculoRepository.findById(idVehiculo).isPresent()?
				vehiculoRepository.findById(idVehiculo).orElseThrow():null;
	}

	@Override
	public VehiculoEntity crearVehiculo(VehiculoEntity vehiculoEntity) {
		return vehiculoRepository.save(vehiculoEntity);
	}

	@Override
	public VehiculoEntity modificarVehiculo(VehiculoEntity vehiculoEntity) {
		return vehiculoRepository.findById(vehiculoEntity.getIdVehiculo()).isPresent()?
				vehiculoRepository.save(vehiculoEntity):null;
	}

	@Override
	public void eliminarVehiculo(Long idVehiculo) {
		vehiculoRepository.deleteById(idVehiculo);
		
	}

}
