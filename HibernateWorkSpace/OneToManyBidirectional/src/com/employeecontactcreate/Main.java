package com.employeecontactcreate;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Main {
	public static void main(String[] args) {
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();
		Transaction tx = session.getTransaction();

		tx.begin();

		Employee parent = new Employee();
		parent.setuName("Dipesh");
		parent.setuId(101);

		Number child1 = new Number();
		child1.setpName("post-1");
		child1.setpId(201);

		Number child2 = new Number();
		child2.setpName("post-2");
		child2.setpId(202);

		Number child3 = new Number();
		child3.setpName("post-3");
		child3.setpId(203);

//		Set<College> child = new HashSet<College>();
//		child.add(child1);
//		child.add(child2);
//		child.add(child3);
//		parent.setChildren(child);
//
//		session.save(parent);
		/*
		 * one to many Set<Bus> child = new HashSet<Bus>(); child.add(child1);
		 * child.add(child2); child.add(child3); parent.setChildren(child);
		 * session.save(parent);
		 */

		child1.setParentObjects(parent);
		child2.setParentObjects(parent);
		child3.setParentObjects(parent);
		session.save(child1);
		session.save(child2);
		session.save(child3);

		tx.commit();
		session.close();
	}
}
