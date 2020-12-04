package com.packetbiscuitscreate;

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

		Packet parent = new Packet();
		parent.setpId(101);
		parent.setpName("Parle");

		Biscuit child1 = new Biscuit();
		child1.setbId(201);
		child1.setbName("Monaco");
		child1.setParentObjects(parent);

		Biscuit child2 = new Biscuit();
		child2.setbId(202);
		child2.setbName("Hide and Seek");
		child2.setParentObjects(parent);

		Biscuit child3 = new Biscuit();
		child3.setbId(203);
		child3.setbName("Burbon");
		child3.setParentObjects(parent);

		session.save(child1);
		session.save(child2);
		session.save(child3);

		tx.commit();
		session.close();
	}
}
