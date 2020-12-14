package com.empdeptcreate;

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
		
		Employee parent = new Employee();
		parent.setsId(101);
		parent.setsName("Ramdas");
		
		Departments child1 = new Departments();
		child1.setcId(201);
		child1.setcName("Dipesh");
		child1.setParentObjects(parent);
		
		Departments child2 = new Departments();
		child2.setcId(202);
		child2.setcName("Harsh");
		child2.setParentObjects(parent);
		
		Departments child3 = new Departments();
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
