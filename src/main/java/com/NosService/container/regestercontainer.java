package com.NosService.container;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.NosService.model.regester;
import com.NosService.service.regesterservice;



@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class regestercontainer {
	
	@Autowired
	private regesterservice service;
	
	@GetMapping("/regester")
	public List<regester> findall()
	{
		return service.getregester();
	}

	@GetMapping("/regester/{id}")
	public regester findbyid(@PathVariable int id)
	{
		return service.getregesterbyid(id);
	}
	
	@PostMapping("/regester")
	public void save(@RequestBody regester regester)
	{
		service.postregester(regester);
	}
	
	@PutMapping("/regester/{id}")
	public void put(@RequestBody regester regester ,@PathVariable int id )
	{
		service.postregester(regester);
	}
	
	@DeleteMapping("/regester/{id}")
	public void delete(@PathVariable int id )
	{
		service.deleteregester(id);
	}
}
