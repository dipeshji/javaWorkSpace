package com.employeetodoupdate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class TestUpate {
	public static void main(String[] args) {
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();
		Transaction tx = session.getTransaction();

		tx.begin();

		Object obj = session.get(ToDo.class, 101);
		ToDo child = (ToDo) obj;

		child.settTask("Deployment");
		session.update(child);
		tx.commit();
		session.close();
	}
}
