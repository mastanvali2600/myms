package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class School {
	@Id
	private String schoolId;
	private String name;
	private String address;

	private School() {
		super();
	}

	private School(String schoolId, String name, String address) {
		super();
		this.schoolId = schoolId;
		this.name = name;
		this.address = address;
	}

	public static School instance(String schoolId, String name, String address) {
		return new School(schoolId, name, address);
	}
	
	public String getSchoolId() {
		return schoolId;
	}

	public String getName() {
		return name;
	}

	public String getAddress() {
		return address;
	}

	@Override
	public String toString() {
		return "School [schoolId=" + schoolId + ", name=" + name + ", address=" + address + "]";
	}
	
}
