package com.ty.car;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class SaveCar {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("vikas");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		Car c = new Car();
		c.setName("A6");
		c.setBrand("Audi");
		c.setCost(698760.354629);
		c.setType("sedan");

		et.begin();
		em.persist(c);
		et.commit();
		System.out.println("----------done-------------");

	}
}
