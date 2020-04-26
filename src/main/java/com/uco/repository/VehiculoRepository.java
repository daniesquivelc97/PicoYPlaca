package com.uco.repository;

import java.util.List;

import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.uco.entity.VehiculoEntity;

public interface VehiculoRepository extends CrudRepository<VehiculoEntity, Long> {
	
	@Query("select c from PicoYPlacaEntity where c.usuario.idUsuario = :idUsuario")
	public List<VehiculoEntity> findByUsuario(@Param("idUsuario") Long idUsuario);

}
