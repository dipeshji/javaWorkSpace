package Hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateMain {
	public static void main(String[] args) {
		
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();
		
		UserDTO user = new UserDTO();
	    user.setLastName("Dipesh");
	    user.setFirstName("Patidar");
	    user.setAddress("Mars");
	    user.setPassword("1234");
	    user.setUserId("10as");
	    
	    session.beginTransaction();
	    session.save(user);
	    session.getTransaction().commit();
	    session.close();
	}
}
