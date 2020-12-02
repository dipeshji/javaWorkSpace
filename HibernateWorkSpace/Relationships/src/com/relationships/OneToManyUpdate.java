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
		
		Vendor parent = new Vendor();
		parent.setVid(102);
		parent.setVname("idea");
		
		Object obj = session.get(Customer.class, 202);
		Customer cus = (Customer) obj;
		cus.setVendorId(102);
		
		Set<Customer> child = new HashSet<Customer>();
		child.add(cus);
		
		parent.setChildren(child);
		
		session.save(parent);
		
		tx.commit();
		session.close();
		
	}
}
