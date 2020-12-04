package com.salemencontact;

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

		SaleMen parent = new SaleMen();
		parent.setsId(201);
		parent.setsName("Dipesh");

		Contact child1 = new Contact();
		child1.setcId(201);
		child1.setcNum(9834209);

		Contact child2 = new Contact();
		child2.setcId(202);
		child2.setcNum(423423);

		Contact child3 = new Contact();
		child3.setcId(203);
		child3.setcNum(234234);

		Set<Contact> s = new HashSet<>();

		s.add(child1);
		s.add(child2);
		s.add(child3);

		parent.setChildren(s);

		session.save(parent);

		tx.commit();
		session.close();
		factory.close();

	}
}
