package com.example.demo.model;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonIdentityReference;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

@Entity
public class Student {

	@Id
	private String studentId;
	
	private String rollNumber;
	
	private String name;
	
	@ManyToOne
	@JoinColumn(name = "classSectionId")
	@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class,property = "classSectionId")
	@JsonIdentityReference(alwaysAsId = true)
	private ClassInfo classInfo;
	
	@ManyToOne
	@JoinColumn(name = "parentId")
	@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class,property = "parentId")
	@JsonIdentityReference(alwaysAsId = true)
	private Parent parent;
	
	@OneToMany(mappedBy = "id.students",fetch = FetchType.LAZY,cascade = CascadeType.ALL)
	private Set<Mark> marks;
	
	@OneToMany(mappedBy = "id.student",fetch = FetchType.LAZY,cascade = CascadeType.ALL)
	private Set<Attendance> attendance;

	private Student(String studentId, String rollNumber, String name, ClassInfo classInfo, Parent parent) {
		super();
		this.studentId = studentId;
		this.rollNumber = rollNumber;
		this.name = name;
		this.classInfo = classInfo;
		this.parent = parent;
	}
	
	public static Student instance(String studentId, String rollNumber, String name, ClassInfo classInfo, Parent parent) {
		return new Student(studentId, rollNumber, name, classInfo, parent);
	}

	public String getStudentId() {
		return studentId;
	}

	public String getRollNumber() {
		return rollNumber;
	}

	public String getName() {
		return name;
	}

	public ClassInfo getClassInfo() {
		return classInfo;
	}

	public Parent getParent() {
		return parent;
	}

	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", rollNumber=" + rollNumber + ", name=" + name + ", classInfo="
				+ classInfo + ", parent=" + parent + ", marks=" + marks + ", attendance=" + attendance + "]";
	}

}
