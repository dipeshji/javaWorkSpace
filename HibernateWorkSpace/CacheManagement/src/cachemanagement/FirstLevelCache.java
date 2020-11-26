package cachemanagement;

import org.hibernate.SessionFactory;
import org.hibernate.Session;
import org.hibernate.cfg.Configuration;

public class FirstLevelCache {
	public static Session startSession() {
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();
		return session;
	}
	
	public static void main(String[] args) throws InterruptedException {
		Session session = startSession();
		session.beginTransaction();
		
		Employee emp1 = (Employee) session.load(Employee.class, 2610);
		System.out.println(emp1.getFirstName() + " " + emp1.getLastName()); //data fetched from dataBase
		
		Employee emp2 = (Employee) session.load(Employee.class, 2610);
		System.out.println(emp2.getFirstName() + " " + emp2.getLastName()); //data fetched from cache
		
//		Thread.sleep(10000); //let stop here update database from back terminal while commenting next three lines
	
		emp1.setFirstName("Dipesh");
		session.update(emp1);
		session.getTransaction().commit();
		
		Employee emp3 = (Employee) session.load(Employee.class, 2610);
		System.out.println(emp3.getFirstName() + " "  + emp3.getLastName()); //no query ran and can't be seen in output that mean data is fetched from cache
		
//		Thread.sleep(100);
		session.close();
		Session session2 = startSession(); //create new session
		
		Employee emp4 = (Employee) session2.load(Employee.class, 2610);
		System.out.println(emp4.getFirstName() + " "  + emp4.getLastName()); //data is fetched from database
	}
}
