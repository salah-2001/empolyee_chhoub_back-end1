package com.NosService.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name=" regesterempolyee")
public class regester {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) 
	private int id;
	private String nom_complet;
	private String nom_utilisateur;
	private String email;
	private String motpasse;
	private String telephone;
	
	
	public regester() {
		super();
	}


	public regester(int id, String nom_complet, String nom_utilisateur, String email, String motpasse,
			String telephone) {
		super();
		this.id = id;
		this.nom_complet = nom_complet;
		this.nom_utilisateur = nom_utilisateur;
		this.email = email;
		this.motpasse = motpasse;
		this.telephone = telephone;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getNom_complet() {
		return nom_complet;
	}


	public void setNom_complet(String nom_complet) {
		this.nom_complet = nom_complet;
	}


	public String getNom_utilisateur() {
		return nom_utilisateur;
	}


	public void setNom_utilisateur(String nom_utilisateur) {
		this.nom_utilisateur = nom_utilisateur;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getMotpasse() {
		return motpasse;
	}


	public void setMotpasse(String motpasse) {
		this.motpasse = motpasse;
	}


	public String getTelephone() {
		return telephone;
	}


	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}
	
	
	
	

}
