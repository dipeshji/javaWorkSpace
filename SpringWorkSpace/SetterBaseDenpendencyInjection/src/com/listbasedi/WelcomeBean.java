package com.listbasedi;

import java.util.List;

public class WelcomeBean {
	private List studentData;

	public List getStudentData() {
		return studentData;
	}

	public void setStudentData(List studentData) {
		this.studentData = studentData;
	}

	public void showStudentData() {
		System.out.println("List base DI");
		System.out.println(this.studentData);
	}
}
