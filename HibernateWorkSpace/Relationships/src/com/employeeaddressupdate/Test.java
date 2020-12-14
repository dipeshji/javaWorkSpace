package com.employeeaddressupdate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


public class Test {
	public static void main(String[] args) {
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();

		Transaction tx = session.getTransaction();
		tx.begin();

		Object obj = session.get(Employee.class, 102);
		Employee parent = (Employee) obj;

		Object ob = session.get(Address.class, 201);
		Address child = (Address) ob;
		child.setfKprincipleId(parent.getpId());

		session.update(child);
		tx.commit();
		session.close();

	}
}
