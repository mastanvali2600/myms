package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Principal {
	@Id
	private String principalJoinId;
	private String name;
	private String email;
	private String phoneNumber;
	private String password;
	public String getPrincipalJoinId() {
		return principalJoinId;
	}
	public void setPrincipalJoinId(String principalJoinId) {
		this.principalJoinId = principalJoinId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "Principal [principalJoinId=" + principalJoinId + ", name=" + name + ", email=" + email
				+ ", phoneNumber=" + phoneNumber + ", password=" + password + "]";
	}
		
}
