package Hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class UserDTOUpdateMain {
	public static void main(String[] args) {
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();
		
		UserDTO user = new UserDTO();
		
		user.setId(1);
		user.setFirstName("Dip");
		user.setLastName("Jirati");
		
		session.beginTransaction();
		session.update(user);
		session.getTransaction().commit();
		
		session.close();
		factory.close();
	}	
}
