package com.ty.car;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class SaveReview {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("vikas");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
		CustomerReview cr = new CustomerReview();
	    cr.setSubject("reviewing");
	    cr.setContent("racing beast");
	    cr.setWritername("moha");
	    
	    et.begin();
	    em.persist(cr);
	    et.commit();
	    
	  System.out.println("------------done---------------");
	    
	}
}
