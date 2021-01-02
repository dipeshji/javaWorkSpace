package com.vendorcustomercreate;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class TestCreate {
	public static void main(String[] args) {
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();

		Transaction tx = session.beginTransaction();

		Customer cst1 = new Customer();
		cst1.setCustomerId(101);
		cst1.setCustomerName("Dipesh");

		Customer cst2 = new Customer();
		cst2.setCustomerId(102);
		cst2.setCustomerName("Palash");

		Customer cst3 = new Customer();
		cst3.setCustomerId(103);
		cst3.setCustomerName("Mohan");

		Set<Customer> children = new HashSet<Customer>();
		children.add(cst1);
		children.add(cst2);
		children.add(cst3);

		Vendor parent = new Vendor();
		parent.setVendorId(201);
		parent.setVendorName("Dipesh");
		parent.setChildren(children);

		session.save(parent);
		tx.commit();

		session.close();
		factory.close();
	}
}
