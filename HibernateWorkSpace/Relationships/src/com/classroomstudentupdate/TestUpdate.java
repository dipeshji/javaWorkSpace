package com.classroomstudentupdate;

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

		Object obj = session.get(ClassRoom.class, 202);
		ClassRoom parent = (ClassRoom) obj;

		Object ob = session.get(Student.class, 101);
		Student child = (Student) ob;
		child.setfKcRoomId(parent.getcId());
		child.setsName("Tenth");

		session.update(child);
		tx.commit();
		session.close();

	}
}
