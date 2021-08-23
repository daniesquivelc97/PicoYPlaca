package com.uco.repository;

import org.springframework.data.repository.CrudRepository;

import com.uco.entity.AdminEntity;

public interface AdminRepository extends CrudRepository<AdminEntity,Long> {
	
	AdminEntity findByEmailAndPassword(String email, String password);

}
