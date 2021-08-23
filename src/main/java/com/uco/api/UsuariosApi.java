package com.uco.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.uco.entity.UsuariosEntity;
import com.uco.entity.VehiculoEntity;
import com.uco.service.UsuariosService;

@RestController
@CrossOrigin(origins="*", methods= {RequestMethod.GET, RequestMethod.POST, RequestMethod.PUT, RequestMethod.DELETE})
@RequestMapping("/usuarios")
public class UsuariosApi {
	
	@Autowired
	private UsuariosService usuariosService;
	
	@GetMapping(value="/all")
	public List<UsuariosEntity> getUsuario(){
		return usuariosService.getUsuario();
	}
	
	@GetMapping("/{idUsuario}")
	public UsuariosEntity getUsuario(@PathVariable("idUsuario")Long idUsuario) {
		return usuariosService.getUsuario(idUsuario);
	}
	
	@PostMapping(value="/crearUsuario", produces="application/json")
	public UsuariosEntity crearUsuario(@RequestBody UsuariosEntity usuariosEntity) {
		return usuariosService.crearUsuario(usuariosEntity);
	}
	
	@PutMapping(value="/modificarUsuario", produces="application/json")
	public UsuariosEntity modificarUsuario(@RequestBody UsuariosEntity usuariosEntity) {
		return usuariosService.modificarUsuario(usuariosEntity);
	}
	
	@DeleteMapping("/{idUsuario}")
	public void eliminarUsuario(@PathVariable("idUsuario") Long idUsuario) {
		usuariosService.eliminarUsuario(idUsuario);
	}
	
	@PostMapping(path="/crearUsuarioYVehiculo", produces ="application/json")
	public VehiculoEntity crearUsuarioYVehiculo(@RequestBody UsuariosEntity usuariosEntity, VehiculoEntity vehiculoEntity) {
		vehiculoEntity = usuariosService.crearUsuarioYVehiculo(usuariosEntity, vehiculoEntity);
		return vehiculoEntity;
	}

}
