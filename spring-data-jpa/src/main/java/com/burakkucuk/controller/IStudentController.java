package com.burakkucuk.controller;

import java.util.List;

import com.burakkucuk.entites.Student;

public interface IStudentController {

	public Student saveStudent(Student student);
	
	public List<Student> getAllStudent ();
	
	public Student getStudentById (Integer id);
	
	
	public void deleteStuden(Integer id);
	
	public Student updateStudent(Integer id , Student updateStudent);
}
