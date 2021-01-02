package com.studentdelete;

import com.jpa.Student;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class TestDelete {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("JPAService");
		EntityManager em = emf.createEntityManager();

		em.getTransaction().begin();

		Object obj = em.getReference(Student.class, 104);
		Student st = (Student) obj;

		em.remove(st);
		em.getTransaction().commit();

		em.close();
		emf.close();
	}
}
