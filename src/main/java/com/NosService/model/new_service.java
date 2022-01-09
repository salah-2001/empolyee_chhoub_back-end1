package com.NosService.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity 
@Table(name="serviceajouterempolye")
public class new_service {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) 
	private int id;
	private String prenom;
	private String nom;
	private String telephone;
	private String email;
	private String ville;
	private String address;
	private String typeservice;
	private String serviceimg;
	private String parlevotreservice;
	public new_service() {
		super();
	}
	public new_service(int id, String prenom, String nom, String telephone, String email, String ville, String address,
			String typeservice, String serviceimg, String parlevotreservice) {
		super();
		this.id = id;
		this.prenom = prenom;
		this.nom = nom;
		this.telephone = telephone;
		this.email = email;
		this.ville = ville;
		this.address = address;
		this.typeservice = typeservice;
		this.serviceimg = serviceimg;
		this.parlevotreservice = parlevotreservice;
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
	public String getTelephone() {
		return telephone;
	}
	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getVille() {
		return ville;
	}
	public void setVille(String ville) {
		this.ville = ville;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getTypeservice() {
		return typeservice;
	}
	public void setTypeservice(String typeservice) {
		this.typeservice = typeservice;
	}
	public String getServiceimg() {
		return serviceimg;
	}
	public void setServiceimg(String serviceimg) {
		this.serviceimg = serviceimg;
	}
	public String getParlevotreservice() {
		return parlevotreservice;
	}
	public void setParlevotreservice(String parlevotreservice) {
		this.parlevotreservice = parlevotreservice;
	}
	

}
