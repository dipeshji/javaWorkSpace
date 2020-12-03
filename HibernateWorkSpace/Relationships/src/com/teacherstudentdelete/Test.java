package com.teacherstudentdelete;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Test {
	public static void main(String[] args) {
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();
		Transaction tx = session.getTransaction();
		
		tx.begin();
		
		Object obj = session.get(Teacher.class, 102);
		Teacher t = (Teacher) obj;
		
		session.delete(t);
		tx.commit();
		session.close();
	}
}
