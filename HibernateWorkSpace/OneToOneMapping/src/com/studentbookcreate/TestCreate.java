package com.studentbookcreate;

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

		Student parent = new Student();
		parent.setsId(101);
		parent.setsName("Dipesh");

		Book child = new Book();
		child.setbId(201);
		child.setbName("Book-1");
		child.setParent(parent);

		Transaction tx = session.beginTransaction();
		session.save(child);
		tx.commit();
		session.close();
		factory.close();
	}
}
