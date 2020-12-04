package com.shopkeepercustomercreate;

import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.Session;
import org.hibernate.cfg.Configuration;

public class TestCreate {
	public static void main(String[] args) {
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();
		Transaction tx = session.getTransaction();
		
		tx.begin();
		
		Shopkeeper parent = new Shopkeeper();
		parent.setsId(101);
		parent.setsName("Ramdas");
		
		Customer child1 = new Customer();
		child1.setcId(201);
		child1.setcName("Dipesh");
		child1.setParentObjects(parent);
		
		Customer child2 = new Customer();
		child2.setcId(202);
		child2.setcName("Harsh");
		child2.setParentObjects(parent);
		
		Customer child3 = new Customer();
		child3.setcId(203);
		child3.setcName("Palak");
		child3.setParentObjects(parent);
		
		session.save(child1);
		session.save(child2);
		session.save(child3);
		
		tx.commit();
		session.close();
	}
}
