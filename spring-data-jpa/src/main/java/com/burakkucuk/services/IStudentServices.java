package com.burakkucuk.services;

import java.util.List;

import com.burakkucuk.entites.Student;

public interface IStudentServices {

	
	public Student saveStudent(Student student);
	public List<Student> getAllStudent();
	public Student getStudentById(Integer id);
	
	public void deleteStudent(Integer id);
	
	public Student updateStudent(Integer id  , Student updateStudent);
}
 