package com.enit.test;
import com.enit.examen.*;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class TestCreateBD {
	private static final String PERSISTENCE_UNIT_NAME = "application";
    private static EntityManagerFactory emf;

	public static void main(String[] args) {
		

	 
	       emf = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT_NAME);
	       EntityManager em = emf.createEntityManager();
		
	       EntityTransaction tx=em.getTransaction();
	       try {

		     System.out.println("cest le try!!!! ");
		     tx.begin();
		     Etudiant e1= new Etudiant (1,"erijgmail.com", "aaaa" , true ,"sayari","erij");
		     TypeReclamation tr1 = new TypeReclamation(11 , "type_1");
		     Reclamation r1 =new Reclamation(111, "titre1", "description1" ,e1, tr1);
		     em.persist(e1);
		     em.persist(tr1);
		     em.persist(r1);
		     
		     
		     
		     tx.commit();
		    }
		    catch(Exception e) {
		      // En "vrai" il faudrait affiner un peu plus...
		    	System.out.println("cest le catch!!!! ");
		      e.printStackTrace();
		      if (tx != null) {
		        tx.rollback();
		      }
		    }
		    finally {
		      if (em != null) {
		        em.close();
		      }
		      if (emf != null) {
		        emf.close();
		      }
		    }
	}

}
