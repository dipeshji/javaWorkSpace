package com.create;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.EntityManager;

public class TestCreate {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("JPAService");
		EntityManager em = emf.createEntityManager();

		em.getTransaction().begin();

		Student s1 = new Student();
		s1.setStudentId(101);
		s1.setStudentName("Dipesh");

		Student s2 = new Student();
		s2.setStudentId(102);
		s2.setStudentName("Mini");

		Student s3 = new Student();
		s3.setStudentId(103);
		s3.setStudentName("Palak");

		Student s4 = new Student();
		s4.setStudentId(104);
		s4.setStudentName("Mahesh");

		Student s5 = new Student();
		s5.setStudentId(105);
		s5.setStudentName("Ajay");

		Set<Student> students1 = new HashSet<Student>();
		Set<Student> students2 = new HashSet<Student>();

		students1.add(s1);
		students2.add(s2);
		students1.add(s3);
		students2.add(s4);
		students1.add(s5);

		Teacher t1 = new Teacher();
		t1.setTeacherId(201);
		t1.setTeacherName("Dipesh");
		t1.setStudents(students1);

		Teacher t2 = new Teacher();
		t2.setTeacherId(202);
		t2.setTeacherName("Mahesh");
		t2.setStudents(students2);

		em.persist(t1);
		em.persist(t2);

		em.getTransaction().commit();
		em.close();
		emf.close();
	}
}
