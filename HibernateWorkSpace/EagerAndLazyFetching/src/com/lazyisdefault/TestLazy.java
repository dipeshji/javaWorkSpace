package com.lazyisdefault;

import java.util.Iterator;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class TestLazy {
	public static void main(String args[]) {
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();
		Transaction tx = session.getTransaction();
		tx.begin();

		Object obj = session.get(Manager.class, 101);
		Manager mang = (Manager) obj;

//		Set child = mang.getChildren();
//		Iterator itr = child.iterator();
//
//		Employee emp;
//		while (itr.hasNext()) {
//			emp = (Employee) itr.next();
//			System.out.println(emp.getEmpName() + " " + emp.getEmpId());
//		}
	}
}