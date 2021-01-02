package com.categoryitemcreate;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class TestCreate {
	public static void main(String[] args) {
		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
		Session session = factory.openSession();

		Transaction tx = session.beginTransaction();

//		Set<Categories> categories = new HashSet<Categories>();

		Categories c1 = new Categories();
		c1.setCategoryName("Kitchen");
		c1.setColumnId(101);

		Categories c2 = new Categories();
		c2.setCategoryName("Cosmatics");
		c2.setColumnId(102);

		Item i1 = new Item();
		i1.setItemName("Spoon");
		i1.setItemId(201);

		Item i2 = new Item();
		i2.setItemId(202);
		i2.setItemName("Cream");

//		categories.add(c1);
//		categories.add(c2);

//		i1.setCategories(categories);

		Set<Item> items = new HashSet<Item>();
		items.add(i1);
		items.add(i2);

		c1.setItems(items);
		c2.setItems(items);

		session.save(c1);
		session.save(c2);

		tx.commit();
		session.close();
		factory.close();
	}
}
