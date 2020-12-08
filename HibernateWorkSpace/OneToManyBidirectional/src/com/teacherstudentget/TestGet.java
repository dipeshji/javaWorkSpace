package com.teacherstudentget;

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

		Object obj = session.get(Student.class, 201);
		Student child = (Student) obj;

		System.out.println(child.getsName() + " " + child.getsId());

		Teacher parent = child.getParentObjects();
		System.out.println(parent.gettName() + " " + parent.gettId());

		session.close();
	}
}
