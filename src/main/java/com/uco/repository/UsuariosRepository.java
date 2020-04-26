package com.uco.repository;

import org.springframework.data.repository.CrudRepository;

import com.uco.entity.UsuariosEntity;

public interface UsuariosRepository extends CrudRepository<UsuariosEntity, Long> {

}
