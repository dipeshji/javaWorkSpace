package com.peoplelicenseupdate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class TestUpdate {
	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");

		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();

		Transaction tx = session.getTransaction();
		tx.begin();
		
		Object obj = session.get(People.class, 101);
		People parent = (People) obj;
		parent.setpName("Dipesh");
		
		session.update(parent);
	
		
		tx.commit();
		session.close();
	}
}
