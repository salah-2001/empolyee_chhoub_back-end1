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

import com.NosService.model.contact;
import com.NosService.service.contactservice;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class contactcontrelle {
	
	@Autowired
	private contactservice service;
	
	@GetMapping("/contact")
	public List<contact> findall()
	{
		return service.getcontactall();
	}
	
	@GetMapping("/contact/{id}")
	public contact findbyid(@PathVariable int id)
	{
		return service.getcontactbyid(id);
	}
	
	@PostMapping("/contact")
	public void save(@RequestBody contact contact)
	{
		service.postcontact(contact);
	}
	
	@PutMapping("/contact/{id}")
	public void update(@RequestBody contact contact,@PathVariable int id)
	{
		service.postcontact(contact);
	}
	
	@DeleteMapping("/contact/{id}")
	public void delet(@PathVariable int id)
	{
		service.deletcontact(id);
	}

}
