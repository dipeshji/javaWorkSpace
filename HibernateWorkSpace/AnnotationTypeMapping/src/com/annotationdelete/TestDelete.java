package com.annotationdelete;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class TestDelete {
	public static void main(String[] args) {
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();

		Transaction tx = session.beginTransaction();

		Object obj = session.get(Student.class, 102);
		Student s = (Student) obj;
		session.delete(s);
		tx.commit();
		session.close();
		factory.close();
	}
}
