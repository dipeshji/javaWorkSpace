package com.jpa;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class TestJpa {
	public static void main(String args[]) throws Exception {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("JPAService");
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		Student st = new Student();
		st.setStudentId(101);
		st.setStudentName("Dipesh");
		
		em.persist(st);
		em.getTransaction().commit();
		em.close();
		emf.close();
	}
}
