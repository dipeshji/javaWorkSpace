package com.annotationcreate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class CreateTest {
	public static void main(String[] args) {
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();

		Transaction tx = session.beginTransaction();

		Product p = new Product();
		p.setProductID(101);
		p.setProName("Cycle");
		p.setPrice(11100);

		session.save(p);
		tx.commit();
		session.close();
	}
}
