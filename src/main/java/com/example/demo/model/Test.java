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
	
	@OneToMany(mappedBy = "id.test",fetch = FetchType.LAZY,cascade = CascadeType.ALL)
	private Set<Mark> marks;

	private Test() {
		super();
	}

	private Test(String testId, String name) {
		super();
		this.testId = testId;
		this.name = name;
	}
	
	public static Test instance(String testId, String name) {
		return new Test(testId, name);
	}
	
	public String getTestId() {
		return testId;
	}

	public String getName() {
		return name;
	}

	@Override
	public String toString() {
		return "Test [testId=" + testId + ", name=" + name + "]";
	}
	
}
