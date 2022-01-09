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

import com.NosService.model.new_service;
import com.NosService.service.serviceservice;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class servicecontrolle {
	
	@Autowired
	private serviceservice service;
	
	@GetMapping("/ajouteservice")
	public List<new_service> findall()
	{
		return service.getall();
	}

	@GetMapping("/ajouteservice/{id}")
	public new_service findbyid(@PathVariable int id)
	{
		return service.getbyid(id);
	}
	
	@PostMapping("/ajouteservice")
	public void save(@RequestBody new_service new_service)
	{
		service.saveservice(new_service);
	}
	
	@PutMapping("/ajouteservice/{id}")
	public void update(@RequestBody new_service new_service,@PathVariable int id)
	{
		service.saveservice(new_service);
	}
	
	@DeleteMapping("/ajouteservice/{id}")
	public void delete(@PathVariable int id)
	{
		service.deleteservice(id);
	}
}
