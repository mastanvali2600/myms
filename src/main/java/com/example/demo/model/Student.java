package com.example.demo.model;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Student {

	@Id
	private String studentId;
	
	private String rollNumber;
	
	private String name;
	
	@ManyToOne
	private ClassInfo classInfo;
	
	@ManyToOne
	private Parent parent;
	
	@OneToMany(mappedBy = "markPrimaryKey.students",fetch = FetchType.LAZY,cascade = CascadeType.ALL)
	private Set<Mark> marks;
	
	@OneToMany(mappedBy = "attendancePK.student",fetch = FetchType.LAZY,cascade = CascadeType.ALL)
	private Set<Attendance> attendance;

	public String getStudentId() {
		return studentId;
	}

	public void setStudentId(String studentId) {
		this.studentId = studentId;
	}

	public String getRollNumber() {
		return rollNumber;
	}

	public void setRollNumber(String rollNumber) {
		this.rollNumber = rollNumber;
	}

	public Parent getParent() {
		return parent;
	}

	public void setParent(Parent parent) {
		this.parent = parent;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public ClassInfo getClassInfo() {
		return classInfo;
	}

	public void setClassInfo(ClassInfo classInfo) {
		this.classInfo = classInfo;
	}

	
	public Set<Mark> getMarks() {
		return marks;
	}

	public void setMarks(Set<Mark> marks) {
		this.marks = marks;
	}
	
	public Set<Attendance> getAttendance() {
		return attendance;
	}

	public void setAttendance(Set<Attendance> attendance) {
		this.attendance = attendance;
	}

	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", rollNumber=" + rollNumber + ", name=" + name + ", classInfo="
				+ classInfo + ", parent=" + parent + ", marks=" + marks + ", attendance=" + attendance + "]";
	}


}
