package Hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class DeleteUser {
	public static void main(String args[]) {
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();
		
		UserDTO userToDelete = session.get(UserDTO.class, 2);
		
		session.delete(userToDelete);
		tx.commit();
		session.close();
		factory.close();
	}
}
