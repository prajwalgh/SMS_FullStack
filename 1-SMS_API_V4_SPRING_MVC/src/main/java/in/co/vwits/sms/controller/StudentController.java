package in.co.vwits.sms.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.hibernate.Hibernate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import in.co.vwits.model.exception.StudentNotFoundException;
import in.co.vwits.sms.model.Student;
import in.co.vwits.sms.service.StudentService;
//@Controller is use to create web controllers 
//@Controller
@RestController //@Controller + @ResponseBody = @RestController
@RequestMapping("/student")
public class StudentController {
	@Autowired
	private StudentService  service;
	
	
	
	@GetMapping(value="/{rollno}")
	public Student findStudentById(@PathVariable int rollno) throws StudentNotFoundException {
		return 	this.service.findOneWithSubjectsLearning(rollno).get();
		}
	@DeleteMapping(value="/{rollno}")
	public void deleteByRollNo(@PathVariable int rollno) {
		this.service.deleteStudent(rollno);
		System.out.println("delete by rollno : "+ rollno);
	}
	@GetMapping()
	public List<Student> findAll() {
		//List<Student> studentList=new ArrayList<Student>();
		List<Student> a=this.service.findAllWithSubjects();
		System.out.println(a.size());
		return a;
		//This method call is talking to service layer, which in tern calling dao which in terms fetching data from database
		}
	
	@PutMapping(value="/{rollno}")
	public Student updateStudent(@PathVariable int rollno,@RequestBody Student studentToBeupdated) { 
		System.out.println(studentToBeupdated);
		Student updatedStudent=null;
		return updatedStudent;
	}
	
	@PutMapping(value="/{rollno}/{marks}")
	public void updateStudentMarks(@PathVariable int rollno,@PathVariable int marks) { 
		this.service.updateMarkByRollNo(rollno, marks);
	}
//	@ResponseBody
//	@RequestMapping(method=RequestMethod.POST)  
	@PostMapping()
	public void createNewStudent(@RequestBody Student newStudent) { 
		 this.service.save(newStudent);

	}
	
}
