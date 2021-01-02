import com.customer.*;
import com.khatabook.*;
import java.sql.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import com.transections.*;
import com.aapnediye.*;
import com.aapneliye.*;

public class Main {
	public static void main(String args[]) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("JPAService");
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();

		Customer cust1 = new Customer();
		cust1.setCustomerId(101);
		cust1.setCustomerName("Dipesh");
		cust1.setCustomerNum(9009809339l);

		Customer cust2 = new Customer();
		cust2.setCustomerId(102);
		cust2.setCustomerName("Palak");
		cust2.setCustomerNum(9131670191l);

		Set<Customer> customers = new HashSet<Customer>();
		customers.add(cust1);
		customers.add(cust2);

		Khata khata = new Khata();
		khata.setBusinessName("Shivalay chai");
		khata.setKhataId(201);
		khata.setCustomer(customers);

		Transections tx1 = new Transections();
		tx1.setTransectionId(301);
		tx1.setTransectionType("Diye");
		tx1.setBusinessName("shivalay chai");
		tx1.setBusinessId(201);
		tx1.setCustomerName("Dipesh");
		tx1.setCustomerId(101);

		Transections tx2 = new Transections();
		tx2.setTransectionId(302);
		tx2.setTransectionType("Liye");
		tx2.setBusinessName("shivalay chai");
		tx2.setBusinessId(201);
		tx2.setCustomerName("Dipesh");
		tx2.setCustomerId(101);

		AapneDiye ad = new AapneDiye();
		ad.setDiyeId(401);
		ad.setAapneDiye(30);
		ad.setDate(new Date(0));
		ad.setDetails("No details");
		ad.setTransections(tx1);

		AapneLiye al = new AapneLiye();
		al.setLiyeId(501);
		al.setLiye(30);
		al.setDate(new Date(0));
		al.setDetails("No details");
		al.setTransections(tx2);

		em.persist(khata);
		em.persist(ad);
		em.persist(al);
		em.getTransaction().commit();

		em.close();
		emf.close();
	}
}
