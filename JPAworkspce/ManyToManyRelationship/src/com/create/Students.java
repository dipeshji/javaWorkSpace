package com.create;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "students")
public class Students {
	@Id
	@Column(name = "s_id")
	private Integer studentId;

	@Column(name = "s_name")
	private String studentName;

	@ManyToMany(targetEntity = Courses.class, cascade = CascadeType.ALL)
	@JoinTable(name = "courses_students", joinColumns = @JoinColumn(name = "stu_id_fk", referencedColumnName = "s_id"), inverseJoinColumns = @JoinColumn(name = "course_id_fk", referencedColumnName = "c_id"))
	private Set courses;

	public Integer getStudentId() {
		return studentId;
	}

	public void setStudentId(Integer studentId) {
		this.studentId = studentId;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public Set getCourses() {
		return courses;
	}

	public void setCourses(Set courses) {
		this.courses = courses;
	}

}
