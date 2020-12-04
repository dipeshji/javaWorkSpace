package com.vehicletyreread;

import java.util.Iterator;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class TestRead {
	public static void main(String[] args) {
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();
		Transaction tx = session.getTransaction();
		tx.begin();

		Object obj = session.get(Vehicle.class, 201);
		Vehicle mang = (Vehicle) obj;

		Set child = mang.getChildren();
		Iterator itr = child.iterator();

		Tyre ty;
		while (itr.hasNext()) {
			ty = (Tyre) itr.next();
			System.out.println(ty.getTyCompany() + " " + ty.getTyId() + " " + ty.getTyCount());
		}

	}
}
