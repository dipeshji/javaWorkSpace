package com.mapbasedi;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class WelcomeBean {
	private Map studentData;

	public void setStudentData(Map studentData) {
		this.studentData = studentData;
	}

	public void showStudentData() {
		System.out.println("Map base DI");
		Set s = this.studentData.entrySet();
		Iterator itr = s.iterator();

		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}
