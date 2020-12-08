package com.cartitemcreate;

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

		Item i1 = new Item();
		i1.setiId(101);
		i1.setiName("Brush");

		Item i2 = new Item();
		i2.setiId(102);
		i2.setiName("Paint");

		Cart c1 = new Cart();
		c1.setcName("cart-1");
		c1.setcId(201);

		Cart c2 = new Cart();
		c2.setcName("cart-2");
		c2.setcId(202);

		Set<Cart> cart = new HashSet<Cart>();

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
