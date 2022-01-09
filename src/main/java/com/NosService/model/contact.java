package com.NosService.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="contactempolye")
public class contact {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) 
	private int id;
	private String prenom;
	private String nom;
	private String email;
	private String telephone;
	private String message;
	
	
	public contact() {
		super();
	}


	public contact(int id, String prenom, String nom, String email, String telephone, String message) {
		super();
		this.id = id;
		this.prenom = prenom;
		this.nom = nom;
		this.email = email;
		this.telephone = telephone;
		this.message = message;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getPrenom() {
		return prenom;
	}


	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}


	public String getNom() {
		return nom;
	}


	public void setNom(String nom) {
		this.nom = nom;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getTelephone() {
		return telephone;
	}


	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}


	public String getMessage() {
		return message;
	}


	public void setMessage(String message) {
		this.message = message;
	}
	
	

}
