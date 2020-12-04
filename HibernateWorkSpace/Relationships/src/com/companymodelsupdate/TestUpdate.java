package com.companymodelsupdate;

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

		Object obj = session.get(Company.class, 202);
		Company parent = (Company) obj;

		Object ob = session.get(Models.class, 101);
		Models child = (Models) ob;
		child.setfKCompanyId(parent.getcId());
		child.setmName("Aspire");

		session.update(child);
		tx.commit();
		session.close();

	}
}
