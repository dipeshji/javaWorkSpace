package com.relationships;

import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

public class OneToManyUpdate {
	public static void main(String[] args) {
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();

		Transaction tx = session.getTransaction();
		tx.begin();

		Object obj = session.get(Vendor.class, 105);
		Vendor parent = (Vendor) obj;
		
		Object ob = session.get(Customer.class, 201);
		Customer child = (Customer) ob;
		child.setVendorId(parent.getVid());
		
		session.update(child);
		tx.commit();
		session.close();

	}
}
