package com.ty.car;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class SaveUser {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("vikas");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		User u = new User();
		u.setName("hema");
		u.setEmail("hema@gmail.com");
		u.setGender('f');
		u.setPassword("MOhaseen@1998");
		
		et.begin();
		em.persist(u);
		et.commit();
		System.out.println("------------done--------------");

	}
}
