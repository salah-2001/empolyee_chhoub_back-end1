package com.NosService.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.NosService.model.new_service;
import com.NosService.repository.servicerepository;

@Service
public class serviceservice {
	
	@Autowired
	private servicerepository repository;
	
	public List<new_service> getall()
	{
		return repository.findAll();
	}
	
	public new_service getbyid(int id)
	{
		return repository.findById(id).get();
	}
	
	public void saveservice(new_service new_service)
	{
		 repository.save(new_service);
	}
	
	public void deleteservice(int id)
	{
		repository.deleteById(id);
	}

}
