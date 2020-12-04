package com.countrycontinentsget;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.buschildrenget.Bus;
import com.buschildrenget.Children;

public class TestGet {
	public static void main(String[] args) {
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();
		Transaction tx = session.getTransaction();

		tx.begin();

		Object o = session.get(Country.class, 101);
		Country child = (Country) o;
		Continent parent = child.getParentObjects();
		System.out.println(parent.getcName() + " " + parent.getcId());
		System.out.println(child.getcName() + " " + child.getcId());

		session.close();
	}
}
