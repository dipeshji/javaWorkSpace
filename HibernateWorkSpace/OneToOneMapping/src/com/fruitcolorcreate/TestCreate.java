package com.fruitcolorcreate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class TestCreate {
	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");

		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();

		Color parent = new Color();
		parent.setsId(101);
		parent.setsName("Dipesh");

		Fruit child = new Fruit();
		child.setaId(201);
		child.setState("Madhya Pradesh");
		child.setCity("Mandleshwar");
		child.setS(parent);

		Transaction tx = session.beginTransaction();
		session.save(child);
		tx.commit();
		session.close();
		factory.close();
	}
}
