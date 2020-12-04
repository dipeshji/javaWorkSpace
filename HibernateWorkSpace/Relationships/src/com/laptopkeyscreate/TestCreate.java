package com.laptopkeyscreate;

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

		Laptop parent = new Laptop();
		parent.setlId(201);
		parent.setlName("Dipesh");

		Keys child1 = new Keys();
		child1.setkId(201);
		child1.setkName("D");

		Keys child2 = new Keys();
		child2.setkId(202);
		child2.setkName("L");

		Keys child3 = new Keys();
		child3.setkId(203);
		child3.setkName("W");

		Set<Keys> s = new HashSet<>();

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
