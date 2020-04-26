package com.uco.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.uco.entity.VehiculoEntity;
import com.uco.entity.UsuariosEntity;
import com.uco.repository.UsuariosRepository;

@Service
@Transactional
public class UsuariosServiceImpl implements UsuariosService {
	
	@Autowired
	private UsuariosRepository usuariosRepository;
	
	@Autowired
	private UsuariosService usuariosService;
	
	@Autowired
	private VehiculoService vehiculoService;
	

	@Override
	public UsuariosEntity getUsuario(Long idUsuario) {
		return usuariosRepository.findById(idUsuario).isPresent()?
				usuariosRepository.findById(idUsuario).orElseThrow():null;
	}

	@Override
	public List<UsuariosEntity> getUsuario() {
		return (List<UsuariosEntity>) usuariosRepository.findAll();
	}

	@Override
	public UsuariosEntity crearUsuario(UsuariosEntity usuariosEntity) {
		return usuariosRepository.save(usuariosEntity);
	}

	

	@Override
	public UsuariosEntity modificarUsuario(UsuariosEntity usuariosEntity) {
		return usuariosRepository.findById(usuariosEntity.getIdUsuario()).isPresent()?
				usuariosRepository.save(usuariosEntity):null;
	}

	@Override
	public void eliminarUsuario(Long idUsuario) {
		usuariosRepository.deleteById(idUsuario);
		
	}
	
	@Override
	public VehiculoEntity crearUsuarioYVehiculo(UsuariosEntity usuariosEntity, VehiculoEntity vehiculoEntity) {
		usuariosService.crearUsuario(usuariosEntity);
		vehiculoEntity.setUsuario(usuariosEntity);
		return vehiculoService.crearVehiculo(vehiculoEntity);
	}

}
