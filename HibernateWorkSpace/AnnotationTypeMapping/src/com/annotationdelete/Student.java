package com.annotationdelete;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Student")
public class Student {
	@Id
	@Column(name = "student_id")
	private Integer studentId;

	@Column(name = "s_name", length = 20)
	private String studentName;

	/**
	 * @return the studentId
	 */
	public Integer getStudentId() {
		return studentId;
	}

	/**
	 * @param studentId the studentId to set
	 */
	public void setStudentId(Integer studentId) {
		this.studentId = studentId;
	}

	/**
	 * @return the studentName
	 */
	public String getStudentName() {
		return studentName;
	}

	/**
	 * @param studentName the studentName to set
	 */
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	/**
	 * @return the marks
	 */
	public Integer getMarks() {
		return marks;
	}

	/**
	 * @param marks the marks to set
	 */
	public void setMarks(Integer marks) {
		this.marks = marks;
	}

	@Column(name = "s_marks")
	private Integer marks;
}
