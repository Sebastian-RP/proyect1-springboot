package com.proyectconnection.app.dao;

import org.springframework.data.repository.CrudRepository;

import com.proyectconnection.app.entity.Customer;

public interface IClienteDao extends CrudRepository<Customer, Long> {
	
	//ya contamos con los metodos para el cud debido al import de la clase CrudRespository
}
 


