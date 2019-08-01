package com.example.demo.service;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.ClassInfo;
import com.example.demo.model.HomeWork;
import com.example.demo.model.Subject;
import com.example.demo.model.composit.HomeWorkPK;
import com.example.demo.repository.HomeWorkRepository;
import com.example.demo.utils.DateUtils;

@Service
public class HomeWorkService {

	@Autowired
	private HomeWorkRepository homeWorkRepository;

	public void save(ClassInfo classInfo, Subject subject, LocalDate homeWorkDate, String homeWorkinfo) {
		homeWorkRepository.save(HomeWork
				.instance(HomeWorkPK.instance(DateUtils.formate(homeWorkDate), classInfo, subject), homeWorkinfo));
	}

	public List<HomeWork> findAll() {
		return homeWorkRepository.findAll();
	}
}
