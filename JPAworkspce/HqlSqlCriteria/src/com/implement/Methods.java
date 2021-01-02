package com.implement;

import java.util.Iterator;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.hibernate.Criteria;

public class Methods {

	EntityManagerFactory emf;
	EntityManager em;

	EntityManager getEntityManager() {
		emf = Persistence.createEntityManagerFactory("JPAService");
		em = emf.createEntityManager();

		return em;
	}

//	==========================================
	public void selectAllSql() {

		System.out.println("OutPut from all sql");
		em = getEntityManager();
		em.getTransaction().begin();
		Query q = em.createNativeQuery("select * from employees", Employee.class);

		List<Employee> res = q.getResultList();
		Iterator<Employee> itr = res.iterator();

		Employee emp;
		while (itr.hasNext()) {
			emp = itr.next();
			System.out.println(emp.getFirstName() + " " + emp.getLastName());
		}

		em.close();
		emf.close();

	}

//	============================================

	public void selectAllHql() {
		System.out.println("output from all hql");
		em = getEntityManager();
		em.getTransaction().begin();

		Query q = em.createQuery("from Employee");

		List<Employee> res = q.getResultList();
		Iterator<Employee> itr = res.iterator();

		Employee emp;
		while (itr.hasNext()) {
			emp = (Employee) itr.next();
			System.out.println(emp.getFirstName() + " " + emp.getLastName());
		}
		em.close();
		emf.close();
	}

//	================================================

	public void selectAllCriteria() {
		System.out.println("output from all criteria");
		em = getEntityManager();
		em.getTransaction().begin();

		CriteriaBuilder cb = em.getCriteriaBuilder();
		CriteriaQuery<Employee> cq = cb.createQuery(Employee.class);
		Root<Employee> emp = cq.from(Employee.class);
		CriteriaQuery<Employee> select = cq.select(emp);
		Query q = em.createQuery(select);
		List<Employee> res = q.getResultList();

		Iterator itr = res.iterator();
		Employee empl;
		while (itr.hasNext()) {
			empl = (Employee) itr.next();
			System.out.println(empl.getFirstName() + " " + empl.getLastName());
		}
		em.close();
		emf.close();
	}

//	=============================================

	public void orderBySql() {
		System.out.println("output from order by sql");
		em = getEntityManager();
		em.getTransaction().begin();
		Query q = em.createNativeQuery("select firstName, lastName from employees order by lastName, firstName",
				Employee.class);

		List res = q.getResultList();
		Iterator itr = res.iterator();

		Employee emp;
		while (itr.hasNext()) {
			emp = (Employee) itr.next();
			System.out.println(emp.getFirstName() + " " + emp.getLastName());
		}
		em.close();
		emf.close();

	}

//	===========================================
	public void orderByHql() {
		System.out.println("output from order by hql");
		em = getEntityManager();
		em.getTransaction().begin();

		Query q = em.createQuery("select firstName, lastName from Employee order by firstName", Employee.class);
		List<Object[]> res = q.getResultList();
		Iterator<Object[]> itr = res.iterator();

		Object columns[];
		while (itr.hasNext()) {
			columns = (Object[]) itr.next();
			System.out.println(columns[0] + " | " + columns[1]);
		}
		em.close();
		emf.close();
	}

}
