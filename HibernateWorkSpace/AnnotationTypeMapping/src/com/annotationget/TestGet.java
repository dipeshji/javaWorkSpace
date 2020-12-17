package com.annotationget;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class TestGet {
	public static void main(String[] args) {
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();

		Transaction tx = session.beginTransaction();

		Object obj = session.get(Student.class, 101);
		Student s = (Student) obj;
		System.out.println(s.getStudentName() + " " + s.getMarks());

		session.close();
		factory.close();
	}

}
