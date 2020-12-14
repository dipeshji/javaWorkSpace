package com.personpassportget;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class TestGet {
	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");

		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();

		Transaction tx = session.getTransaction();
		tx.begin();

		Object obj = session.get(Passport.class, 101);
		Passport child = (Passport) obj;
		System.out.println(child.getpId() + " " + child.getpNo());
		Person parent = child.getParent();
		System.out.println(parent.getpName() + " " + parent.getpId());
		session.close();
	}
}
