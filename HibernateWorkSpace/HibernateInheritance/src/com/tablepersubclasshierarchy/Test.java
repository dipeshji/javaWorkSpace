package com.tablepersubclasshierarchy;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Test {
	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");

		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();

		Transaction tx = session.getTransaction();

		CreditCard c = new CreditCard();

		c.setPaymentId(101);
		c.setAmount(2500);
		c.setCreditCardType("Platinum");

		Cheque ch = new Cheque();
		ch.setPaymentId(102);
		ch.setAmount(3000);
		ch.setChequeType("ICICI");

//	start transaction

		tx.begin();

		session.save(c);
		session.save(ch);

		tx.commit();
		session.close();
	}
}
