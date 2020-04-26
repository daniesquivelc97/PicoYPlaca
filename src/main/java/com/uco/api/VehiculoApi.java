package com.uco.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.uco.entity.VehiculoEntity;
import com.uco.service.VehiculoService;

@RestController
@RequestMapping("/vehiculos")
public class VehiculoApi {
	
	@Autowired
	private VehiculoService vehiculoService;
	
	@GetMapping(value="/all")
	public List<VehiculoEntity> getVehiculos(){
		return vehiculoService.getVehiculos();
	}
	
	@GetMapping("/{idVehiculo}")
	public VehiculoEntity getVehiculo(@PathVariable("idVehiculo") Long idVehiculo) {
		return vehiculoService.getVehiculo(idVehiculo);
	}
	
	@PostMapping(value="/crearVehiculo", produces="application/json")
	public VehiculoEntity crearVehiculo(@RequestBody VehiculoEntity vehiculoEntity) {
		return vehiculoService.crearVehiculo(vehiculoEntity);
	}
	
	@PutMapping(value="/modificarVehiculo", produces="application/json")
	public VehiculoEntity modificarVehiculo(@RequestBody VehiculoEntity vehiculoEntity) {
		return vehiculoService.modificarVehiculo(vehiculoEntity);
	}
	
	@DeleteMapping("/{idVehiculo}")
	public void eliminarVehiculo(@PathVariable("idVehiculo")Long idVehiculo) {
		vehiculoService.eliminarVehiculo(idVehiculo);
	}

}
