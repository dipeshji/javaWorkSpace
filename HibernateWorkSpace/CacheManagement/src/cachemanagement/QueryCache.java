package cachemanagement;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

public class QueryCache {
	public static void main(String[] args) {
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session seesion = factory.openSession();
		seesion.beginTransaction();
		
		Query q = seesion.createQuery("from Employee");
		q.setCacheable(true);
		List res = q.list();
		Iterator itr = res.iterator();
		
		Employee emp;
		while(itr.hasNext()) {
			emp = (Employee)itr.next();
			System.out.println(emp.getFirstName() + " " + emp.getLastName());
		}
		
		seesion.close();
		
		
//		============= session-2 ========================
		System.out.println("================= session-2 started =======================");
		Session session2 = factory.openSession();
		session2.beginTransaction();
		
		Query q2 = session2.createQuery("from Employee");
		q2.setCacheable(true);
		
		List res2 = q2.list();
		Iterator itr2 = res2.iterator();
		
		Employee emp2;
		while(itr2.hasNext()) {
			emp2 = (Employee)itr2.next();
			System.out.println(emp2.getFirstName() + " " + emp2.getLastName());
		}
		
		session2.close();
		
	}
}
