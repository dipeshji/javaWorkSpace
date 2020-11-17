package Hibernate;

import org.hibernate.SessionFactory;
import org.hibernate.Session;
import org.hibernate.cfg.Configuration;

public class GetAndUpdate {
	public static void main(String[] args) {
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();
		
		UserDTO user = (UserDTO) session.get(UserDTO.class, 1);
		user.setFirstName("Dip");
		user.setLastName("Jirati");
		
		session.update(user);
		
		session.getTransaction().commit();
		
		session.close();
		factory.close();
	}
}
