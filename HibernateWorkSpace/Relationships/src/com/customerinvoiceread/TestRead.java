package com.customerinvoiceread;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.studentproject.Project;
import com.studentproject.Student;

public class TestRead {
	public static void main(String[] args) {
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();
		Transaction tx = session.getTransaction();
		tx.begin();

		Object obj = session.get(Customer.class, 101);
		Customer mang = (Customer) obj;
		
		Set child = mang.getChildren();
		Iterator itr = child.iterator();
		
		Invoice emp;
		while(itr.hasNext()) {
			emp = (Invoice) itr.next();
			System.out.println(emp.getiName() + " " + emp.getiId());
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
