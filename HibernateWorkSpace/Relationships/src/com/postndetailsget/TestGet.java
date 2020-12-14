package com.postndetailsget;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.studentproject.Project;
import com.studentproject.Student;

public class TestGet {
	public static void main(String[] args) {
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();
		Transaction tx = session.getTransaction();
		tx.begin();

		Object obj = session.get(Details.class, 101);
		Details mang = (Details) obj;
		
		Set child = mang.getChildren();
		Iterator itr = child.iterator();
		
		Post emp;
		while(itr.hasNext()) {
			emp = (Post) itr.next();
			System.out.println(emp.getEmpName() + " " + emp.getEmpId());
		}

	}
}

//Manager parent = new Manager();
//parent.setManagerId(101);
//parent.setManagerName("Pravin");
//
//Set child = new HashSet<Employee>();
//
//Employee stu = new Employee();
//stu.setEmpId(201);
//stu.setEmpName("Dipesh");
//
//Employee stu1 = new Employee();
//stu1.setEmpId(202);
//stu1.setEmpName("Mahesh");
//
//Employee stu2 = new Employee();
//stu2.setEmpId(203);
//stu2.setEmpName("Palak");
//
//child.add(stu);
//child.add(stu1);
//child.add(stu2);
//
//parent.setChildren(child);
//
//session.save(parent);
//
//tx.commit();
//session.close();
