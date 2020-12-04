package com.countrystatesave;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.shopkeepercustomercreate.Customer;
import com.shopkeepercustomercreate.Shopkeeper;

public class TestSave {
	public static void main(String[] args) {
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();
		Transaction tx = session.getTransaction();

		tx.begin();

		Country parent = new Country();
		parent.setcId(101);
		parent.setcName("India");

		State child1 = new State();
		child1.setsId(201);
		child1.setsName("MP");
		child1.setParentObjects(parent);

		State child2 = new State();
		child2.setsId(202);
		child2.setsName("CG");
		child2.setParentObjects(parent);

		State child3 = new State();
		child3.setsId(203);
		child3.setsName("MH");
		child3.setParentObjects(parent);

		session.save(child1);
		session.save(child2);
		session.save(child3);

		tx.commit();
		session.close();
	}
}
