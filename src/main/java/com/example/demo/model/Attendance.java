package com.example.demo.model;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;

import com.example.demo.model.composit.AttendancePK;

@Entity
public class Attendance {
	@EmbeddedId
	private AttendancePK id;
	
	private boolean isPresent;

	public AttendancePK getId() {
		return id;
	}

	public void setId(AttendancePK id) {
		this.id = id;
	}

	public boolean isPresent() {
		return isPresent;
	}

	public void setPresent(boolean isPresent) {
		this.isPresent = isPresent;
	}

	@Override
	public String toString() {
		return "Attendance [attendancePK=" + id + ", isPresent=" + isPresent + "]";
	}
	
	
}
