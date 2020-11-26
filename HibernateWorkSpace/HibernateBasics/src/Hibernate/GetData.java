package Hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.mysql.jdbc.ResultSet;

public class GetData {
	public static void main(String args[]) {
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();
		
		UserDTO user = (UserDTO) session.get(UserDTO.class, 2);
		
		System.out.println(user.getFirstName() + " " + user.getLastName());
		
		session.close();
		factory.close();
	}
}
