package com.example.demo.model;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;

import com.example.demo.model.composit.HomeWorkPK;

@Entity
public class HomeWork {

	@EmbeddedId
	private HomeWorkPK id;
	
	private String homeWorkinfo;

	public HomeWorkPK getId() {
		return id;
	}

	public void setId(HomeWorkPK id) {
		this.id = id;
	}

	public String getHomeWorkinfo() {
		return homeWorkinfo;
	}

	public void setHomeWorkinfo(String homeWorkinfo) {
		this.homeWorkinfo = homeWorkinfo;
	}

	@Override
	public String toString() {
		return "HomeWork [homeWorkPK=" + id + ", homeWorkinfo=" + homeWorkinfo + "]";
	}
	
}
