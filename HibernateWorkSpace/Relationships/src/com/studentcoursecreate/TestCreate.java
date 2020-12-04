package com.studentcoursecreate;

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

		Student parent = new Student();
		parent.setsId(201);
		parent.setsName("Dipesh");

		Course child1 = new Course();
		child1.setcId(201);
		child1.setcName("Wrath of god");

		Course child2 = new Course();
		child2.setcId(202);
		child2.setcName("Love");

		Course child3 = new Course();
		child3.setcId(203);
		child3.setcName("War");

		Set<Course> s = new HashSet<>();

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
