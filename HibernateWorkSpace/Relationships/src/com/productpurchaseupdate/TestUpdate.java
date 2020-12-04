package com.productpurchaseupdate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class TestUpdate {
	public static void main(String[] args) {
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();

		Transaction tx = session.getTransaction();
		tx.begin();

		Object obj = session.get(Product.class, 202);
		Product parent = (Product) obj;

		Object ob = session.get(Purchase.class, 101);
		Purchase child = (Purchase) ob;
		child.setfKProductId(parent.getPrId());
		child.setPurDetails("for both");

		session.update(child);
		tx.commit();
		session.close();

	}
}
