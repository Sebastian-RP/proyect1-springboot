package com.proyectconnection.app.services;

import com.proyectconnection.app.entity.Customer;

import java.util.List;

public interface IClienteService {

	public List<Customer> findAll();
	
	public Customer findById(Long id);
	
	public Customer save(Customer cliente);
	
	public void delete(Long id);
	
}
