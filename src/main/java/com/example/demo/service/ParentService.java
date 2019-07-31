package com.example.demo.service;

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
		Parent parent=new Parent();
		parent.setPrincipal(principal);
		parent.setName(name);
		parent.setParentId(parentId);
		parent.setPhoneNumber(phoneNumber);
		
		parentRepository.save(parent);
		
	}
}
