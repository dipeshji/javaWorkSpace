package com.relationships;

import java.util.Iterator;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class OneToManyGetDataOfParantWithChild {
	public static void main(String[] args) {
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session sess = factory.openSession();
		
		
		Object res = sess.get(Vendor.class, 101);
		Vendor v = (Vendor) res;
		System.out.println(v.getVname());
		System.out.println(v.getVid());

		Set<Customer> set = v.getChildren();

		Iterator customers = set.iterator();

		Customer customer;
		System.out.println("---------------------------------------");
		System.out.println("| " + "customer name" + "|" + "customer id" + "|" + "vendor_id" + " | ");
		System.out.println("---------------------------------------");
		while (customers.hasNext()) {
			customer = (Customer) customers.next();

			System.out.println(customer.getCname() + " | " + customer.getCid() + " | " + customer.getVendorId());
		}

		sess .close();
		factory.close();
	}
}
