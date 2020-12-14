package com.houseroomscreate;

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

		Rooms parent = new Rooms();
		parent.setlId(201);
		parent.setlName("Dipesh");

		House child1 = new House();
		child1.setkId(201);
		child1.setkName("D");

		House child2 = new House();
		child2.setkId(202);
		child2.setkName("L");

		House child3 = new House();
		child3.setkId(203);
		child3.setkName("W");

		Set<House> s = new HashSet<>();

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
