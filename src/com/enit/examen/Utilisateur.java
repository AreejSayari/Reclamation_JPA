package com.enit.examen;
import javax.persistence.MappedSuperclass;

@MappedSuperclass
public class Utilisateur {
	
	private int id;
	private String email;
	private String password;
	private Boolean actif;
	
	public Utilisateur()
	{
		super();
		actif =false;
	}

	public Utilisateur(int id, String email, String password, Boolean actif) {
		super();
		this.id = id;
		this.email = email;
		this.password = password;
		this.actif = actif;
	}



	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public String getEmail() {
		return email;
	}



	public void setEmail(String email) {
		this.email = email;
	}



	public String getPassword() {
		return password;
	}



	public void setPassword(String password) {
		this.password = password;
	}



	public Boolean getActif() {
		return actif;
	}



	public void setActif(Boolean actif) {
		this.actif = actif;
	}



	

}
