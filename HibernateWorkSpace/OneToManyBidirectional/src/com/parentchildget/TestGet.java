package com.parentchildget;

import java.util.Iterator;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class TestGet {
	public static void main(String[] args) {
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();
		Transaction tx = session.getTransaction();

		tx.begin();

		Object obj = session.get(Parent.class, 101);
		Parent parent = (Parent) obj;

		System.out.println(parent.getpName() + " " + parent.getpId());

		Iterator itr = parent.getChildren().iterator();

		Child st;
		while (itr.hasNext()) {
			st = (Child) itr.next();
			System.out.println(st.getcName() + " " + st.getcId());
		}
	}
}
