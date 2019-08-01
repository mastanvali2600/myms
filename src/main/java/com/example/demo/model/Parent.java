package com.example.demo.model;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonIdentityReference;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

@Entity
public class Parent {
	@Id
	private String parentId;
	private String name;
	private String phoneNumber;
	@OneToOne
	@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class,property = "principalJoinId")
	@JsonIdentityReference(alwaysAsId = true)
	private Principal principal;
	
	@OneToMany(mappedBy = "parent")
	private Set<Student> students;

	private Parent(String parentId, String name, String phoneNumber, Principal principal) {
		super();
		this.parentId = parentId;
		this.name = name;
		this.phoneNumber = phoneNumber;
		this.principal = principal;
	}
	
	public static Parent instance(String parentId, String name, String phoneNumber, Principal principal) {
		return new Parent(parentId, name, phoneNumber, principal);
	}

	public String getParentId() {
		return parentId;
	}

	public String getName() {
		return name;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public Principal getPrincipal() {
		return principal;
	}

	@Override
	public String toString() {
		return "Parent [parentId=" + parentId + ", name=" + name + ", phoneNumber=" + phoneNumber + ", principal="
				+ principal + ", students=" + students + "]";
	}
	
}
