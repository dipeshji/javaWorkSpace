package com.filters;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Filter;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

public class TestFilter {
	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");

		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();

		Transaction tx = session.getTransaction();
		tx.begin();

		session.enableFilter("studentName");
		Query q = session.createQuery("from Student s");

		List res = q.list();

		Iterator it = res.iterator();

		while (it.hasNext()) {
			Student st = (Student) it.next();
			System.out.println("Student name starts with D and ends With D: " + st.getStudentName());
		}

		session.disableFilter("studentName");

		System.out.println("Enabling Age Filter");
		Filter fr = session.enableFilter("studentAge");
		fr.setParameter("age", 25);
		Query qr = session.createQuery("from Student s");
		List res2 = qr.list();
		Iterator itr = res2.iterator();
		while (itr.hasNext()) {
			Student s = (Student) itr.next();
			System.out.println("Students with age greate than 25: " + s.getStudentAge());
		}

		session.disableFilter("studentAge");

		System.out.println("Enabling Id filter");
		Filter fs = session.enableFilter("studentId");
		fs.setParameter("sId", 102);
		Query qre = session.createQuery("from Student s");
		List res3 = qre.list();
		Iterator itre = res3.iterator();
		while (itre.hasNext()) {
			Student s = (Student) itre.next();
			System.out.println("student with id greater than 102: " + s.getStudentId());
		}
		session.disableFilter("studentId");
		session.close();
		factory.close();
	}
}
