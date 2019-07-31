package com.example.demo.model;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;

import com.example.demo.model.composit.MarkPrimaryKey;

@Entity
public class Mark {
	@EmbeddedId
	private MarkPrimaryKey markPrimaryKey;
	
	private Long marks;
	private Long outMarks;
	public MarkPrimaryKey getMarkPrimaryKey() {
		return markPrimaryKey;
	}
	public void setMarkPrimaryKey(MarkPrimaryKey markPrimaryKey) {
		this.markPrimaryKey = markPrimaryKey;
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
