package com.typesofci;

public class Student {
	private String name;
	private String address;
	private Integer age;

	public Student(String name, String address, Integer age) {
		this.name = name;
		this.address = address;
		this.age = age;
	}

	public void displayStudent() {
		System.out.println(this.name + " " + this.age + " " + this.address);
	}
}
