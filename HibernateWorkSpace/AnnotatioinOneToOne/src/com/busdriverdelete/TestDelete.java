package com.busdriverdelete;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class TestDelete {
	public static void main(String[] args) {
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();

		Transaction tx = session.beginTransaction();

		Object obj = session.get(Bus.class, 101);
		Bus child = (Bus) obj;
		System.out.println(child.getBusName());

		session.delete(child);
		tx.commit();

		session.close();
		factory.close();
	}
}
