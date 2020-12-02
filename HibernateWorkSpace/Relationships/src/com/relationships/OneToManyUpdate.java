package com.relationships;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class OneToManyUpdate {
	public static void main(String[] args) {
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();
		
		Transaction tx = session.getTransaction();
		tx.begin();
		
		Object obj = session.get(Vendor.class,101);
		Vendor parent = (Vendor) obj;
		
		parent.setVid(104);	
		Set children = parent.getChildren();
		Set updatedChildren = new HashSet();
		Iterator itr = children.iterator();
		
		Customer cus;
		while(itr.hasNext()) {
			cus = (Customer) itr.next();
			cus.setVendorId(104);
			updatedChildren.add(cus);
		}
		
		parent.setChildren(updatedChildren);
		session.update(parent);
		tx.commit();
		session.close();
		
	}
}
