package com.authorbookcreate;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class TestCreate {
	public static void main(String[] args) {
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();

		Author parent = new Author();
		parent.setaId(102);
		parent.setaName("Dipesh");
		
		Author parent2 = new Author();
		parent2.setaId(101);
		parent2.setaName("Mahesh");

		Book child1 = new Book();
		child1.setbId(201);
		child1.setbName("Wrath of god");

		Book child2 = new Book();
		child2.setbId(202);
		child2.setbName("Love");

		Book child3 = new Book();
		child3.setbId(203);
		child3.setbName("War");

		Set<Book> s = new HashSet<>();

		s.add(child1);
		s.add(child2);
		s.add(child3);

		parent.setChildren(s);

		session.save(parent);

		tx.commit();
		session.close();
		factory.close();

	}
}
