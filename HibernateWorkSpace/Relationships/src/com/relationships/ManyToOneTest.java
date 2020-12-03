package com.relationships;

import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.cfg.Configuration;

public class ManyToOneTest {
	public static void main(String[] args) {
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();

		Vendor parent = new Vendor();
		parent.setVid(101);
		parent.setVname("Jio");

		Customer child1 = new Customer();
		child1.setCid(201);
		child1.setCname("Patidar");

		Customer child2 = new Customer();
		child2.setCid(202);
		child2.setCname("Mukati");

		Customer child3 = new Customer();
		child3.setCid(203);
		child3.setCname("Paliya");

		Set<Customer> s = new HashSet<>();

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
