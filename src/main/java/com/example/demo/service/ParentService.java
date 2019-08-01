package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Parent;
import com.example.demo.model.Principal;
import com.example.demo.repository.ParentRepository;

@Service
public class ParentService {

	@Autowired
	private ParentRepository parentRepository;
	
	public void save(Principal principal, String parentId, String name,String phoneNumber) {
		parentRepository.save(Parent.instance(parentId, name, phoneNumber, principal));
		
	}
	
	public List<Parent> findAll(){
		return parentRepository.findAll();
	}
	
	public Parent findOne(String id) {
		return parentRepository.findOne(id);
	}
}
