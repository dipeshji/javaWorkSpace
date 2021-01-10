package com.setbasedi;

import java.util.Set;

public class WelcomeBean {
	private Set studentData;

	WelcomeBean() {
		System.out.println("In default constructor");
	}

	public Set getStudentData() {
		return studentData;
	}

	public void setStudentData(Set studentData) {
		this.studentData = studentData;
	}

	public void showStudentData() {
		System.out.println(this.studentData);
	}
}
