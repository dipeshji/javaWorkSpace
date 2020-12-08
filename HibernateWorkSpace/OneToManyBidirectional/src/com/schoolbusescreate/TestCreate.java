/*
 * one to many example.
 * this van be many to one also. 
*/

package com.schoolbusescreate;

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
		Transaction tx = session.getTransaction();

		tx.begin();

		School parent = new School();
		parent.setsName("SPIS");
		parent.setsId(101);

		Bus child1 = new Bus();
		child1.setbName("bus1");
		child1.setbId(201);

		Bus child2 = new Bus();
		child2.setbName("bus2");
		child2.setbId(202);

		Bus child3 = new Bus();
		child3.setbName("bus3");
		child3.setbId(203);

		Set<Bus> child = new HashSet<Bus>();
		child.add(child1);
		child.add(child2);
		child.add(child3);
		parent.setChildren(child);

		session.save(parent);
		/*
		 * one to many Set<Bus> child = new HashSet<Bus>(); child.add(child1);
		 * child.add(child2); child.add(child3); parent.setChildren(child);
		 * session.save(parent);
		 */

		/*
		 * many to one child1.setParentObjects(parent); child2.setParentObjects(parent);
		 * child3.setParentObjects(parent); session.save(child1); session.save(child2);
		 * session.save(child3);
		 */

		tx.commit();
		session.close();
	}
}
