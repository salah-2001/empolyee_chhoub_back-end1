package com.NosService.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.NosService.model.regester;
import com.NosService.repository.regesterrepository;



@Service
public class regesterservice {
	
	@Autowired
	private regesterrepository repository;
	
	public List<regester> getregester()
	{
		return repository.findAll();
	}
	
	public regester getregesterbyid(int id)
	{
		return repository.findById(id).get();
	}
	
	public void postregester(regester regester)
	{
		 repository.save(regester);
	}
	
	public void deleteregester(int id)
	{
		repository.deleteById(id);
	}

}
