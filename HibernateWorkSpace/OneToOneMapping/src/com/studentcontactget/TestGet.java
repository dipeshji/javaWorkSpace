package com.studentcontactget;

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
		
		Object obj = session.get(Contact.class, 101);
		Contact child = (Contact) obj;
		System.out.println(child.getcName() + " " + child.getcId());
		Student parent = child.getParent();
		System.out.println(parent.getsName() + " " + parent.getsId());
		
		session.close();
		factory.close();
		
	}
}
