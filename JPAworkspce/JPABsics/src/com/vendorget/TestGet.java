package com.vendorget;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class TestGet {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("JPAService");
		EntityManager em = emf.createEntityManager();

		em.getTransaction().begin();

		Object obj = em.getReference(Vendor.class, 101);
		Vendor vn = (Vendor) obj;

		System.out.println(vn.getVendorName());
		em.close();
		emf.close();
	}
}
