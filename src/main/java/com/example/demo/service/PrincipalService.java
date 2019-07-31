package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.ClassInfo;
import com.example.demo.model.Faculty;
import com.example.demo.model.Mark;
import com.example.demo.model.Parent;
import com.example.demo.model.Principal;
import com.example.demo.model.School;
import com.example.demo.model.Student;
import com.example.demo.model.Subject;
import com.example.demo.model.Test;
import com.example.demo.model.composit.MarkPrimaryKey;
import com.example.demo.repository.ClassInfoRepository;
import com.example.demo.repository.FacultyRepository;
import com.example.demo.repository.MarksRepository;
import com.example.demo.repository.ParentRepository;
import com.example.demo.repository.PrincipalRepository;
import com.example.demo.repository.SchoolRepository;
import com.example.demo.repository.StudentRepository;
import com.example.demo.repository.SubjectRepository;
import com.example.demo.repository.TestRepository;

@Service
public class PrincipalService {
	@Autowired
	private PrincipalRepository principalRepository;
	
	@Autowired
	private SchoolRepository schoolRepository;
	
	@Autowired
	private FacultyRepository facultyRepository;
	
	@Autowired
	private ParentRepository parentRepository;
	
	@Autowired
	private StudentRepository studentRepository;
	
	
	@Autowired
	private ClassInfoRepository classInfoRepository;
	
	@Autowired
	private SubjectRepository subjectRepository;
	
	@Autowired
	private TestRepository testRepository;
	
	@Autowired
	private MarksRepository marksRepository;
	
	public List<Principal> findAll(){
		return principalRepository.findAll();
	}
	public void addPrincipalList() {
		Principal principal=new Principal();
		principal.setPrincipalJoinId("ABCD");
		principal.setEmail("abc@gmail.com");
		principal.setName("abc");
		principal.setPassword("abc");
		principal.setPhoneNumber("9999999999");
		
		Principal principal1=new Principal();
		principal1.setPrincipalJoinId("ABCDE");
		principal1.setEmail("abcE@gmail.com");
		principal1.setName("abcE");
		principal1.setPassword("abcE");
		principal1.setPhoneNumber("9999999991");
		

		School school=new School();
		school.setSchoolId("Sc1");
		school.setName("Zph School");
		school.setAddress("Vkpd");
		
		principal.setSchool(school);
		
		Faculty faculty=new Faculty();
		faculty.setFacultyId("fc1");
		faculty.setName("Sriman");
		faculty.setEmail("sriman@gmail.com");
		faculty.setPassword("sriman");
		faculty.setPhoneNumber("8888888888");
		faculty.setAddress("Hyd");

		schoolRepository.save(school);
		
		List<Principal> principals =new ArrayList<Principal>();
		principals.add(principal);
		principals.add(principal1);
		
		
		principalRepository.save(principals);
		
		faculty.setPrincipal(principal);

		facultyRepository.save(faculty);
		
		Parent parent=new Parent();
		parent.setParentId("p1");
		parent.setName("Subhani");
		parent.setPhoneNumber("7777777777");
		parent.setPrincipal(principal);
		
		parentRepository.save(parent);
		
		ClassInfo classInfo=new ClassInfo();
		classInfo.setClassName("6");
		classInfo.setSectionName("A");
		classInfo.setClassSectionId("6-A");
		
		classInfoRepository.save(classInfo);
		
		Student student=new Student();
		student.setStudentId("6-A-101");
		student.setRollNumber("101");
		student.setName("Nagoor");
		student.setParent(parent);
		student.setClassInfo(classInfo);
		
		studentRepository.save(student);
		
		Subject subject=new Subject();
		subject.setName("Java");
		subject.setSubjectId("1101");
		
		subjectRepository.save(subject);
		
		Test test=new Test();
		test.setTestId("1102");
		test.setName("Unit Test 1");
		
		testRepository.save(test);
		
		Test test1=new Test();
		test1.setTestId("1103");
		test1.setName("Unit Test 2");
		
		testRepository.save(test1);
		
		
		MarkPrimaryKey markPrimaryKey=new MarkPrimaryKey();
		markPrimaryKey.setStudents(student);
		markPrimaryKey.setSubject(subject);
		markPrimaryKey.setTest(test);
		
		Mark mark=new Mark();
		mark.setMarkPrimaryKey(markPrimaryKey);
		mark.setMarks(10l);
		mark.setOutMarks(100l);
		
		MarkPrimaryKey markPrimaryKey1=new MarkPrimaryKey();
		markPrimaryKey1.setStudents(student);
		markPrimaryKey1.setSubject(subject);
		markPrimaryKey1.setTest(test1);
		
		Mark mark1=new Mark();
		mark1.setMarkPrimaryKey(markPrimaryKey1);
		mark1.setMarks(90l);
		mark1.setOutMarks(100l);
		
		marksRepository.save(mark);
		marksRepository.save(mark1);
	}
}
