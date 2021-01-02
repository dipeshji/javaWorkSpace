package com.categoryitemupdate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class TestUpdate {
	public static void main(String[] args) {
		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
		Session session = factory.openSession();

		Transaction tx = session.beginTransaction();
		
		Object obj = session.get(Item.class, 201);
		Item i = (Item) obj;
		
		i.setItemName("Bowl");
		
		session.update(i);
		
		tx.commit();
		
		session.close();
		
		
	}
}
