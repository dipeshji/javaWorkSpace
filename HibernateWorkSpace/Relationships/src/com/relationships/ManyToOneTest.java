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

		Vendor v = new Vendor();
		v.setVid(101);
		v.setVname("Jio");

		Customer c1 = new Customer();
		c1.setCid(201);
		c1.setCname("Patidar");

		Customer c2 = new Customer();
		c2.setCid(202);
		c2.setCname("Mukati");

		Customer c3 = new Customer();
		c3.setCid(203);
		c3.setCname("Paliya");

		Set<Customer> s = new HashSet<>();

		s.add(c1);
		s.add(c2);
		s.add(c3);

		v.setChildren(s);

		session.save(v);

		tx.commit();
		session.close();
		factory.close();

	}
}
