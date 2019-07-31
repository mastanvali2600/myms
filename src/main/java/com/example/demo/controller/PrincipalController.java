package com.example.demo.controller;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.ClassInfo;
import com.example.demo.model.Faculty;
import com.example.demo.model.Parent;
import com.example.demo.model.Principal;
import com.example.demo.model.School;
import com.example.demo.model.Student;
import com.example.demo.model.Subject;
import com.example.demo.model.Test;
import com.example.demo.service.AttendanceService;
import com.example.demo.service.ClassInfoService;
import com.example.demo.service.FacultyService;
import com.example.demo.service.HomeWorkService;
import com.example.demo.service.MarksService;
import com.example.demo.service.ParentService;
import com.example.demo.service.PrincipalService;
import com.example.demo.service.SchoolService;
import com.example.demo.service.StudentService;
import com.example.demo.service.SubjectService;
import com.example.demo.service.TestService;

@RestController
@RequestMapping(value = "/rest")
public class PrincipalController {
	
	@Autowired
	private PrincipalService principalService;
	
	@Autowired
	private SchoolService schoolService;
	
	@Autowired
	private FacultyService facultyService;
	
	@Autowired
	private ParentService parentService;
	
	@Autowired
	private ClassInfoService classInfoService;
	
	@Autowired
	private StudentService studentService;
	
	@Autowired
	private SubjectService subjectService;
	
	@Autowired
	private TestService testService;
	
	@Autowired
	private MarksService markService;
	
	@Autowired
	private HomeWorkService homeWorkService;
	
	@Autowired
	private AttendanceService attendanceService;
	
	@RequestMapping(method = RequestMethod.GET,value = "/ap")
	public String home() {
		addPrincipalList();
		return "home1";
	}
	@GetMapping(value = "/principals")
	public List<Principal> findAll(){
		return principalService.findAll();
	}
	

	public void addPrincipalList() {
		
		schoolService.save("Sc1", "Zph School", "Vkpd");
		School school1=schoolService.findOne("Sc1");

		principalService.save("ABCD", "abc", "abc@gmail.com", "abc", "9999999999", school1);
		Principal principal= principalService.findOne("ABCD");
		
		principalService.save("ABCDE", "abcE", "abcE@gmail.com", "abcE", "9999999991", null);
		Principal principal2= principalService.findOne("ABCDE");
		
		facultyService.save("fc1", "Sriman", "sriman@gmail.com", "sriman", "Hyd", "8888888888", principal2);		
		Faculty faculty=facultyService.findOne("fc1");
		
		parentService.save(principal, "p1", "Subhani", "7777777777");
		Parent parent=parentService.findOne("p1");
		
		classInfoService.save("6", "A");
		ClassInfo classInfo=classInfoService.findOne("6-A");
		
		studentService.save("6-A-101", "Nagoor", "101", parent, classInfo);
		Student student=studentService.findOne("6-A-101");
		
		subjectService.save("1101", "Java");
		Subject subject=subjectService.findOne("1101");
		
		testService.save("1102", "Unit Test 1");
		Test test=testService.findOne("1102");
		
		testService.save("1103", "Unit Test 2");
		Test test1=testService.findOne("1103");
		
		markService.save(student, subject, test, 10l, 100l);
		markService.save(student, subject, test1, 90l, 100l);
		
		homeWorkService.save(classInfo, subject, new Date(), "To day you free");
		
		attendanceService.save(new Date(), student, subject, false);
		
	}
}
