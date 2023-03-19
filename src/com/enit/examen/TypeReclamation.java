package com.enit.examen;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.OneToMany;

public class TypeReclamation {

	private int id;
	private String type;
	@OneToMany (mappedBy="typeRec")
	private List<Reclamation> reclamations ;	//entite esclave
	
	public TypeReclamation()
	{
		super();
		reclamations= new ArrayList<Reclamation>();
	}
	public TypeReclamation(int id, String type)
	{
		super();
		this.id = id;
		this.type = type;
		reclamations= new ArrayList<Reclamation>();
	}
	public TypeReclamation(int id, String type, List<Reclamation> reclam)
	{
		super();
		this.id = id;
		this.type = type;
		this.reclamations = reclam;
	}

	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getType() {
		return type;
	}


	public void setType(String type) {
		this.type = type;
	}

	
	public List<Reclamation> getReclamations() {
		return reclamations;
	}


	public void setReclamations(List<Reclamation> reclamations) {
		this.reclamations = reclamations;
	}
	
	
	
	

}
