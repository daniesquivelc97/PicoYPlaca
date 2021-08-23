package com.uco.service;

import com.uco.entity.AdminEntity;

public interface AdminService {
	
	public AdminEntity getUsuarioLogin(String usuario, String password);
	
	public AdminEntity crearUsuarioAdmin(AdminEntity adminEntity);

}
