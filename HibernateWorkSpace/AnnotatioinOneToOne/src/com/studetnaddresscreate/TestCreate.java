package com.studetnaddresscreate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class TestCreate {
	public static void main(String[] args) {
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();

		Transaction tx = session.beginTransaction();

		Student parent = new Student();
		parent.setStudentId(201);
		parent.setStudentName("Dipesh");

		Address child = new Address();
		child.setAddress("Mandleshwar");
		child.setAddressId(101);
		child.setParent(parent);

		session.save(child);
		tx.commit();
		session.clear();
		factory.close();
	}
}
