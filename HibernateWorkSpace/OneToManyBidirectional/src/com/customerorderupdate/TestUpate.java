package com.customerorderupdate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class TestUpate {
	public static void main(String[] args) {
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();
		Transaction tx = session.getTransaction();

		tx.begin();

		Object obj = session.get(Customer.class, 101);
		Customer parent = (Customer) obj;

		parent.setcName("Dipesh");
		session.update(parent);
		tx.commit();
		session.close();
	}
}
