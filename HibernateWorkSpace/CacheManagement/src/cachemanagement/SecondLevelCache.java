package cachemanagement;

import org.hibernate.SessionFactory;
import org.hibernate.Session;
import org.hibernate.cfg.Configuration;

public class SecondLevelCache {
	
	public static void main(String args[]) throws InterruptedException {
		
//		=================== case 1 ==================================
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session1 = factory.openSession();
		session1.beginTransaction();
		
		System.out.println("Session-1 started");
//		
		Employee emp1 = (Employee) session1.load(Employee.class, 2421);
		System.out.println(emp1.getFirstName() + " " + emp1.getLastName()); //Data loaded from data base
		
		
//		
		session1.close();
		Thread.sleep(10000);
//		
//		emp1.setFirstName("Ankit");
//		session1.update(emp1);//update 
//		session1.getTransaction().commit();
		
//		Employee emp2 = (Employee) session1.load(Employee.class, 2421); //data loaded from second level cache also known as global cache
//		System.out.println(emp2.getFirstName() + " " + emp2.getLastName());
		
//		session1.close();
		
		Thread.sleep(1000);
		
//		============== case 2 ===================================
		
		Session session2 = factory.openSession();
		session2.beginTransaction();
		
		System.out.println("Session-2 started");
		
		Employee emp3 = (Employee) session2.load(Employee.class, 2421); 
		System.out.println(emp3.getFirstName() + " " + emp3.getLastName());
		
//		Thread.sleep(10000); //update database from terminal while sleeping  
//	
//		Employee emp4 = (Employee) session2.load(Employee.class, 2421); //data is loaded from cache
//		System.out.println(emp4.getFirstName() + " " + emp4.getLastName());
		session2.close();
		
	}
}
