package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class School {
	@Id
	private String schoolId;
	private String name;
	private String address;
	public String getSchoolId() {
		return schoolId;
	}
	public void setSchoolId(String schoolId) {
		this.schoolId = schoolId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "School [schoolId=" + schoolId + ", name=" + name + ", address=" + address + "]";
	}
	
}
