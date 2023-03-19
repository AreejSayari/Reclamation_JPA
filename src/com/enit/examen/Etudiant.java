package com.enit.examen;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;



@Entity
@Table (name="etudiants")
public class Etudiant extends Utilisateur {
	private String nom;
	private String prenom;
	@OneToMany (mappedBy="etudiant")
	private List<Reclamation> reclamations ; //Entité esclave
	
	
	

	public Etudiant() {
		super();
		reclamations = new ArrayList<Reclamation>();
	}

	public Etudiant(int id, String email, String password, Boolean actif , String nom, String prenom) {
		super(id, email, password, actif);
		this.nom=nom;
		this.prenom=prenom;
		reclamations = new ArrayList<Reclamation>();

	}
	public Etudiant(int id, String email, String password, Boolean actif , String nom, String prenom,List<Reclamation> reclam) {
		super(id, email, password, actif);
		this.nom=nom;
		this.prenom=prenom;
		this.reclamations = reclam;
	}

	@Column(name="reclamations")
	public List<Reclamation> getReclamations() {
		return reclamations;
	}


	public void setReclamations(List<Reclamation> reclamations) {
		this.reclamations = reclamations;
	}


	@Column(name="nom")
	public String getNom() {
		return nom;
	}


	public void setNom(String nom) {
		this.nom = nom;
	}

	@Column(name="prenom")
	public String getPrenom() {
		return prenom;
	}


	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public boolean equals(Etudiant e)
	{
		if(this.nom == e.getNom() &&this.prenom == e.getPrenom() )
			return true;
		return false;
	}
	


}
