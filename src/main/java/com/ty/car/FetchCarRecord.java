package com.ty.car;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class FetchCarRecord {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("vikas");
		EntityManager em = emf.createEntityManager();

		String sql = "SELECT c FROM Car c WHERE c. brand=:brand and c.name=:name";// named query parameter
		Query q = em.createQuery(sql);
		q.setParameter("brand", "benz");// position type query parameter
		q.setParameter("name", "AMG");
		
		List<Car> c = q.getResultList();
		if(c.size()>0)
		{
		for (Car cr : c) {
			System.out.println("ID:" + cr.getBrand());
			System.out.println("Email: " + cr.getCost());
			System.out.println("Password :" + cr.getName());
		}
		}
		else {
			System.out.println(" NO car model present");
		}
	}
	
}
