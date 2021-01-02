package com.studentupdate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import com.jpa.Student;

public class TestUpdate {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("JPAService");
		EntityManager em = emf.createEntityManager();

		em.getTransaction().begin();

		Object obj = em.getReference(Student.class, 101);

		Student st = (Student) obj;
		st.setStudentName("Sandeep");

		em.merge(st);
		em.getTransaction().commit();

		em.close();
		emf.close();
	}
}
