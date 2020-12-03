package com.parentchild;

import java.util.Iterator;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class test {
	public static void main(String[] args) {
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();
		Transaction tx = session.getTransaction();
		tx.begin();

		Object obj = session.get(Parent.class, 201);
		Parent mang = (Parent) obj;

		Set child = mang.getChildren();
		Iterator itr = child.iterator();

		Children emp;
		while (itr.hasNext()) {
			emp = (Children) itr.next();
			System.out.println(emp.getcName() + " " + emp.getcId());
		}

	}
}
