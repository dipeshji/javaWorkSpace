package com.custorderget;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class TestGet {
	public static void main(String[] args) {
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();
		Transaction tx = session.getTransaction();

		tx.begin();
		
		Object o = session.get(Orders.class, 101);
		Orders child = (Orders) o;
		Customer parent = child.getParentObjects();
		System.out.println(parent.getbName() + " " + parent.getbId());
		System.out.println(child.getcName() + " " + child.getcId());
		
		session.close();
	}
}
