package com.example.demo.model;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;

import com.example.demo.model.composit.MarkPrimaryKey;

@Entity
public class Mark {
	@EmbeddedId
	private MarkPrimaryKey id;
	
	private Long marks;
	private Long outMarks;
	
	public MarkPrimaryKey getId() {
		return id;
	}
	public void setId(MarkPrimaryKey id) {
		this.id = id;
	}
	public Long getMarks() {
		return marks;
	}
	public void setMarks(Long marks) {
		this.marks = marks;
	}
	public Long getOutMarks() {
		return outMarks;
	}
	public void setOutMarks(Long outMarks) {
		this.outMarks = outMarks;
	}
	
	
}
