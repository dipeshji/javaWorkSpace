package com.customeraccountcreate;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class TestCreate {
	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");

		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();

		Account i1 = new Account();
		i1.setiId(101);
		i1.setiName("Brush");

		Account i2 = new Account();
		i2.setiId(102);
		i2.setiName("Paint");

		Customer c1 = new Customer();
		c1.setcName("cart-1");
		c1.setcId(201);

		Customer c2 = new Customer();
		c2.setcName("cart-2");
		c2.setcId(202);

		Set<Customer> cart = new HashSet<Customer>();

		cart.add(c1);
		cart.add(c2);

		i1.setCart(cart);
		i2.setCart(cart);

		Transaction tx = session.beginTransaction();

		session.save(i1);
		session.save(i2);

		tx.commit();
		session.close();

	}
}
