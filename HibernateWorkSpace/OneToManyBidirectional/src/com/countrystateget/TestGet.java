package com.countrystateget;

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

		Object obj = session.get(Country.class, 101);
		Country parent = (Country) obj;

		System.out.println(parent.getcName() + " " + parent.getcId());

		Iterator itr = parent.getChildren().iterator();

		State st;
		while (itr.hasNext()) {
			st = (State) itr.next();
			System.out.println(st.getsName() + " " + st.getsId());
		}
	}
}
