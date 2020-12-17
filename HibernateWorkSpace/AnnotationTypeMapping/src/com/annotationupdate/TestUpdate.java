package com.annotationupdate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class TestUpdate {
	public static void main(String[] args) {
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();

		Transaction tx = session.beginTransaction();

		Object obj = session.get(Product.class, 101);
		Product p = (Product) obj;
		p.setProName("Dipya");

		tx.commit();
		session.close();
		factory.close();
	}
}
