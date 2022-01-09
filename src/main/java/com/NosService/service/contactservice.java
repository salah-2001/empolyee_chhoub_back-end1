package com.NosService.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.NosService.model.contact;
import com.NosService.repository.contactrepository;

@Service
public class contactservice {

	@Autowired
	private contactrepository repository;
	
	public List<contact> getcontactall()
	{
		return repository.findAll();
	}
	
	public contact getcontactbyid(int id)
	{
		return repository.findById(id).get();
	}
	
	public void postcontact(contact contact)
	{
		repository.save(contact);
	}
	
	public void deletcontact(int id)
	{
		repository.deleteById(id);
	}
}
