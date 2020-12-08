package com.authorbookupdate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


public class TestUpdate {
	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");

		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();
		
		Transaction tx = session.beginTransaction();
		
		Object obj = session.get(Book.class, 201);
		Book b = (Book) obj;
		
		b.setbName("Book-4");
		
		session.update(b);
		tx.commit();
		session.close();

	}
}
