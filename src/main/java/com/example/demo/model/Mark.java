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
	
	private Mark() {
		super();
		// TODO Auto-generated constructor stub
	}

	private Mark(MarkPrimaryKey id, Long marks, Long outMarks) {
		super();
		this.id = id;
		this.marks = marks;
		this.outMarks = outMarks;
	}

	public static Mark instance(MarkPrimaryKey id, Long marks, Long outMarks) {
		return new Mark(id, marks, outMarks);
	}

	public MarkPrimaryKey getId() {
		return id;
	}

	public Long getMarks() {
		return marks;
	}

	public Long getOutMarks() {
		return outMarks;
	}
	
}
