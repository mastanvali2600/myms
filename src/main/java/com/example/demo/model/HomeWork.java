package com.example.demo.model;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;

import com.example.demo.model.composit.HomeWorkPK;

@Entity
public class HomeWork {

	@EmbeddedId
	private HomeWorkPK id;
	
	private String homeWorkinfo;

	
	private HomeWork(HomeWorkPK id, String homeWorkinfo) {
		super();
		this.id = id;
		this.homeWorkinfo = homeWorkinfo;
	}

	public static HomeWork instance(HomeWorkPK id, String homeWorkinfo) {
		return new HomeWork(id, homeWorkinfo);
	}

	public HomeWorkPK getId() {
		return id;
	}
	
	public String getHomeWorkinfo() {
		return homeWorkinfo;
	}

	@Override
	public String toString() {
		return "HomeWork [homeWorkPK=" + id + ", homeWorkinfo=" + homeWorkinfo + "]";
	}
	
}
