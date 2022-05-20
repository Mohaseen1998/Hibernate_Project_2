package com.ty.car;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class CheckEmailAndPassword {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("vikas");
		EntityManager em = emf.createEntityManager();

		String sql = "SELECT u FROM User u WHERE u.email=?1 and u.password=?2";
		Query q = em.createQuery(sql);
		q.setParameter(1, "moaha@gmail.com");// position type query parameter
		q.setParameter(2, "MOhaseen@1998");
		
		List<User> u = q.getResultList();
		if(u.size()>0)
		{
		for (User us : u) {
			System.out.println("ID:" + us.getId());
			System.out.println("Email: " + us.getEmail());
			System.out.println("Password :" + us.getPassword());
		}
		}
		else {
			System.out.println("Invalid user name and password");
		}
		}

	}


