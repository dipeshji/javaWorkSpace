package com.applicantinterviewrsupdate;

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

		Object obj = session.get(Applicant.class, 202);
		Applicant parent = (Applicant) obj;

		Object ob = session.get(Interviewrs.class, 101);
		Interviewrs child = (Interviewrs) ob;
		child.setfKappliId(parent.getaId());
		child.setiName("Mahesh");

		session.update(child);
		tx.commit();
		session.close();

	}
}
