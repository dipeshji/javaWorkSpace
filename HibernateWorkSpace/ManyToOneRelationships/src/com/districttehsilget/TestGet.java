package com.districttehsilget;

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
		
		Object o = session.get(Thesil.class, 101);
		Thesil child = (Thesil) o;
		District parent = child.getParentObjects();
		System.out.println(parent.getdName() + " " + parent.getdId());
		System.out.println(child.gettName() + " " + child.gettId());
		
		session.close();
	}
}
