package com.personaadharget;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class TestGet {
	public static void main(String[] args) {
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();

		Transaction tx = session.beginTransaction();

		Object obj = session.get(Aadhar.class, 101);
		Aadhar child = (Aadhar) obj;

		Person parent = child.getParent();

		System.out.println(parent.getName() + " " + parent.getPersonId());
		System.out.println(child.getCountryName() + " " + child.getAadharId() + " " + child.getParent().getPersonId());
		session.close();
		factory.close();
	}
}
