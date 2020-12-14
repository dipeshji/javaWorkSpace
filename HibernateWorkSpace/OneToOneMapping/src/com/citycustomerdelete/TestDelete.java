package com.citycustomerdelete;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class TestDelete {
	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");

		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();

		Transaction tx = session.getTransaction();
		tx.begin();

//		Object obj = session.get(Manager.class, 101);
//		Manager parent = (Manager) obj;

		Object obj = session.get(City.class, 101);
		City child = (City) obj;

		session.delete(child);
		tx.commit();
		session.close();
		factory.close();
	}
}
