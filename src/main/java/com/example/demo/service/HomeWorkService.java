package com.example.demo.service;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.ClassInfo;
import com.example.demo.model.HomeWork;
import com.example.demo.model.Subject;
import com.example.demo.model.composit.HomeWorkPK;
import com.example.demo.repository.HomeWorkRepository;

@Service
public class HomeWorkService {
	
	@Autowired
	private HomeWorkRepository homeWorkRepository;
	
	public void save(ClassInfo classInfo,Subject subject, LocalDate homeWorkDate,String homeWorkinfo) {
		HomeWorkPK homeWorkPK=new HomeWorkPK();
		homeWorkPK.setClassInfo(classInfo);
		homeWorkPK.setSubject(subject);
		homeWorkPK.setHomeWorkDate(homeWorkDate.format(DateTimeFormatter.ofPattern("dd-MM-YYYY")));
		
		HomeWork homeWork=new HomeWork();
		homeWork.setId(homeWorkPK);
		homeWork.setHomeWorkinfo(homeWorkinfo);
		
		homeWorkRepository.save(homeWork);
	}
	
	public List<HomeWork> findAll(){
		return homeWorkRepository.findAll();
	}
}
