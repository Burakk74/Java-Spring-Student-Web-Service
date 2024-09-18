package com.burakkucuk.controller.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.burakkucuk.controller.IStudentController;
import com.burakkucuk.entites.Student;
import com.burakkucuk.services.IStudentServices;





@RestController
@RequestMapping("/rest/api/student")
public class StudentControllerImpl implements IStudentController {

	@Autowired
	private IStudentServices studentServices;
	
	
	
	
	@Override
	@PostMapping(path = "/save")
	public Student saveStudent(@RequestBody Student student) {
		 
		return studentServices.saveStudent(student);
	}

	
	
	
	@GetMapping(path = "/list")
	@Override
	public List<Student> getAllStudent() {
		 
 		return studentServices.getAllStudent();
	}

	@GetMapping(path = "/list/{id}")
	@Override
	public Student getStudentById(@PathVariable(name = "id") Integer id) {
		 
		return studentServices.getStudentById(id);
	}


	@Override
	@DeleteMapping("/list/delete/{id}")
	public void deleteStuden(@PathVariable(name = "id") Integer id) {
		 studentServices.deleteStudent(id);
		
	}



	@PutMapping(path = "/list/update/{id}")
	@Override
	public Student updateStudent(@PathVariable(name = "id") Integer id, @RequestBody Student updateStudent) {
		 
		return studentServices.updateStudent(id, updateStudent);
	}
	
	

	
 
 
}
