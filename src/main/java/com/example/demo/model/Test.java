package com.example.demo.model;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Test {

	@Id
	private String testId;
	
	private String name;
	
	@OneToMany(mappedBy = "markPrimaryKey.test",fetch = FetchType.LAZY,cascade = CascadeType.ALL)
	private Set<Mark> marks;

	public String getTestId() {
		return testId;
	}

	public void setTestId(String testId) {
		this.testId = testId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	
	public Set<Mark> getMarks() {
		return marks;
	}

	public void setMarks(Set<Mark> marks) {
		this.marks = marks;
	}

	@Override
	public String toString() {
		return "Test [testId=" + testId + ", name=" + name + "]";
	}
	
}
