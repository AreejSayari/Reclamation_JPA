package com.enit.examen;

import javax.persistence.ManyToOne;

public class Reclamation  {
	
	private int id;
	private String titre;
	private String description;
	@ManyToOne
	private Etudiant etudiant;    // entité maitre
	@ManyToOne
	private TypeReclamation typeRec; // entité maitre
	
	
	public Reclamation()
	{
		super();
	}
	
	public Reclamation(int id, String titre, String description, Etudiant etudiant, TypeReclamation typeRec) {
		super();
		this.id = id;
		this.titre = titre;
		this.description = description;
		this.etudiant = etudiant;
		this.typeRec = typeRec;
	}

	
	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getTitre() {
		return titre;
	}


	public void setTitre(String titre) {
		this.titre = titre;
	}

	
	public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
	}


	public Etudiant getEtudiant() {
		return etudiant;
	}


	public void setEtudiant(Etudiant etudiant) {
		this.etudiant = etudiant;
	}

	@Column(name="type_reclam")
	public TypeReclamation getTypeRec() {
		return typeRec;
	}


	public void setTypeRec(TypeReclamation typeRec) {
		this.typeRec = typeRec;
	}
	
	
	
	
	
	
	

}
