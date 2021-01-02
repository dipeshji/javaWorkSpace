package com.busdriverupdate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class TestUpdate {
	public static void main(String[] args) {
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();

		Transaction tx = session.beginTransaction();
		Object obj = session.get(Bus.class, 102);
		Bus child = (Bus) obj;

		child.setBusName("Bus-12");

		session.update(child);
		tx.commit();
		session.close();

	}
}
