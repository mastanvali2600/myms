package com.example.demo.model;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;

import com.example.demo.model.composit.HomeWorkPK;

@Entity
public class HomeWork {

	@EmbeddedId
	private HomeWorkPK homeWorkPK;
	
	private String homeWorkinfo;

	public HomeWorkPK getHomeWorkPK() {
		return homeWorkPK;
	}

	public void setHomeWorkPK(HomeWorkPK homeWorkPK) {
		this.homeWorkPK = homeWorkPK;
	}

	public String getHomeWorkinfo() {
		return homeWorkinfo;
	}

	public void setHomeWorkinfo(String homeWorkinfo) {
		this.homeWorkinfo = homeWorkinfo;
	}

	@Override
	public String toString() {
		return "HomeWork [homeWorkPK=" + homeWorkPK + ", homeWorkinfo=" + homeWorkinfo + "]";
	}
	
}
