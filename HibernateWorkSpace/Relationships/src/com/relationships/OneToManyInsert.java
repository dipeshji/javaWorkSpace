package com.relationships;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class OneToManyInsert {
	public static void main(String[] args) {
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();

		Transaction tx = session.getTransaction();
		tx.begin();
		
		Vendor ven = new Vendor();
		ven.setVid(105);
		ven.setVname("Idea");
		
		Set children = new HashSet<Customer>();
		
		Customer cus = new Customer();
		cus.setCid(204);
		cus.setCname("Manjhi");
		
		children.add(cus);
		
		ven.setChildren(children);
		
		session.save(ven);
		tx.commit();
		session.close();
	}
}
