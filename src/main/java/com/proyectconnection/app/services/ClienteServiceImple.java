package com.proyectconnection.app.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.proyectconnection.app.dao.IClienteDao;
import com.proyectconnection.app.entity.Customer;

@Service
public class ClienteServiceImple implements IClienteService{
	
	@Autowired
	private IClienteDao clienteDao;
	@Override
	@Transactional(readOnly = true)
	public List<Customer> findAll() {
		
		return (List<Customer>) clienteDao.findAll();
	}
	
	@Transactional
	public IClienteDao getClienteDao() {
		return clienteDao;
	}
	
	@Transactional
	public void setClienteDao(IClienteDao clienteDao) {
		this.clienteDao = clienteDao;
	}

	@Transactional(readOnly = true)
	@Override
	public Customer findById(Long id) {
		return clienteDao.findById(id).orElse(null);
	}

	@Transactional
	@Override
	public Customer save(Customer cliente) {
		return clienteDao.save(cliente);
	}

	@Override
	public void delete(Long id) {
		clienteDao.deleteById(id);
	}
}
