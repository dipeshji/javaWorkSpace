package com.universitycollegecreate;

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

		University parent = new University();
		parent.setuName("SPITM");
		parent.setuId(101);

		College child1 = new College();
		child1.setcName("college 1");
		child1.setcId(201);

		College child2 = new College();
		child2.setcName("college 2");
		child2.setcId(202);

		College child3 = new College();
		child3.setcName("college 3");
		child3.setcId(203);

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
