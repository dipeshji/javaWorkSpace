package com.create;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class TestCreate {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("JPAService");
		EntityManager em = emf.createEntityManager();

		em.getTransaction().begin();

		Author au1 = new Author();
		au1.setAuthorName("Dipesh");
		au1.setAuthorId(101);

		Author au2 = new Author();
		au2.setAuthorName("Mahesh");
		au2.setAuthorId(102);

		Books b1 = new Books();
		b1.setBookId(201);
		b1.setBookName("Book-1");
		b1.setParentObjects(au1);

		Books b2 = new Books();
		b2.setBookId(202);
		b2.setBookName("Book-2");
		b2.setParentObjects(au2);

		Books b3 = new Books();
		b3.setBookId(203);
		b3.setBookName("Book-3");
		b3.setParentObjects(au1);

		em.persist(b1);
		em.persist(b2);
		em.persist(b3);

		em.getTransaction().commit();
		em.close();
		emf.close();
	}
}
