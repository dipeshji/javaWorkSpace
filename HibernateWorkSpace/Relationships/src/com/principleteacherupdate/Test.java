package com.principleteacherupdate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


public class Test {
	public static void main(String[] args) {
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();

		Transaction tx = session.getTransaction();
		tx.begin();

		Object obj = session.get(Principle.class, 102);
		Principle parent = (Principle) obj;

		Object ob = session.get(Teacher.class, 201);
		Teacher child = (Teacher) ob;
		child.setfKprincipleId(parent.getpId());

		session.update(child);
		tx.commit();
		session.close();

	}
}
