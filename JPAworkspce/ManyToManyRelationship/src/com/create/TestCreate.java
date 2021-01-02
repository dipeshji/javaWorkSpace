package com.create;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class TestCreate {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("JPAService");
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();

		Students st1 = new Students();
		st1.setStudentId(101);
		st1.setStudentName("Dipesh");

		Students st2 = new Students();
		st2.setStudentId(102);
		st2.setStudentName("Mahesh");

		Courses co1 = new Courses();
		co1.setCourseId(201);
		co1.setCourseName("Advance Angular");

		Courses co2 = new Courses();
		co2.setCourseId(202);
		co2.setCourseName("Fundamental Analysis");

		Set<Courses> courses = new HashSet<Courses>();
		Set<Students> students = new HashSet<Students>();

		courses.add(co1);
		courses.add(co2);
		students.add(st2);
		students.add(st1);

		st1.setCourses(courses);
		co2.setStudents(students);
		st2.setCourses(courses);
		co1.setStudents(students);

		em.persist(st1);
		em.persist(st2);
		em.persist(co2);

		em.getTransaction().commit();
		em.close();
		emf.close();

	}
}
