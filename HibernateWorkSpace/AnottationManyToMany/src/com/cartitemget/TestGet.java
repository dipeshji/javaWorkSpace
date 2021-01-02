package com.cartitemget;

import java.util.Iterator;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class TestGet {
	public static void main(String[] args) {
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();

		Transaction tx = session.beginTransaction();

		Object obj = session.get(Cart.class, 101);

		Cart c = (Cart) obj;

		System.out.println(c.getCartName() + " " + c.getCartId());
		Iterator<Item> itr = c.getItems().iterator();

		while (itr.hasNext()) {
			Item i = (Item) itr.next();

			System.out.println(i.getItemName() + " " + i.getItemId());
		}

		session.close();
		factory.close();

	}
}

//Cart c1 = new Cart();
//c1.setCartName("cart-1");
//c1.setCartId(101);
//
//Cart c2 = new Cart();
//c2.setCartName("cart-2");
//c2.setCartId(102);
//
//Item i1 = new Item();
//i1.setItemName("Car");
//i1.setItemId(201);
//
//Item i2 = new Item();
//i2.setItemName("Plane");
//i2.setItemId(202);
//
//Set<Item> items = new HashSet<Item>();
//
//items.add(i1);
//items.add(i2);
//
//c1.setItems(items);
//c2.setItems(items);
//
//session.save(c1);
//session.save(c2);
