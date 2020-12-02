package com.studentproject;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class StudentProjectTest {
	public static void main(String[] args) {
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();
		Transaction tx = session.getTransaction();
		tx.begin();

		Project parent = new Project();
		parent.setProjectId(101);
		parent.setProjectName("auto watering");

		Set child = new HashSet<Student>();

		Student stu = new Student();
		stu.setStudentId(201);
		stu.setName("Dipesh");

		Student stu1 = new Student();
		stu1.setStudentId(202);
		stu1.setName("Mahesh");

		Student stu2 = new Student();
		stu2.setStudentId(203);
		stu2.setName("Palak");

		child.add(stu);
		child.add(stu1);
		child.add(stu2);

		parent.setChildren(child);

		session.save(parent);

		tx.commit();
		session.close();

	}
}
