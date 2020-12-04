package com.schoolclassupdate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class TestUpdate {
	public static void main(String[] args) {
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();
		Transaction tx = session.getTransaction();

		tx.begin();
		
		Object obj = session.get(Class.class, 103);
		Class child = (Class) obj;
		
		child.setcName("class4");
		
		tx.commit();
		session.close();
	}
}
