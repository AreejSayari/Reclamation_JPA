package com.enit.examen;

import javax.persistence.Entity;
import javax.persistence.Table;


@Entity
@Table(name="adminastrateurs")
public class Administrateur extends Utilisateur {
	public Administrateur()
	{
		super();
	}

	public Administrateur(int id, String email, String password, Boolean actif) {
		super(id, email, password, actif);
		// TODO Auto-generated constructor stub
	}
	

	

}
