package com.burakkucuk.services.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.burakkucuk.entites.Student;
import com.burakkucuk.repository.StudentRepository;
import com.burakkucuk.services.IStudentServices;



@Service
public class StudentServiceImpl implements IStudentServices {

	@Autowired
	private StudentRepository studentRepository;
	
	
	
	
	@Override
	public Student saveStudent(Student student) {
		 
		return studentRepository.save(student);
		
	}




	@Override
	public List<Student> getAllStudent() {
		 
	   List<Student> studentsList = studentRepository.findAll();
		
		return studentsList;
	}



    @Override
	public Student getStudentById(Integer id) {
		Optional<Student> optional = studentRepository.findById(id);
		
		if(optional.isPresent()) {
			return  optional.get();
		}
		return null;
	}




	@Override
	public void deleteStudent(Integer id) {
		 
		Student deleteStudent = getStudentById(id);
		
		if(deleteStudent != null) {
			studentRepository.delete(deleteStudent);
		}
		
		
	}




	@Override
	public Student updateStudent(Integer id , Student updateStudent) {
		 
	  Student dbStudent =getStudentById(id);
		
	  if(dbStudent != null) {
		  
		  dbStudent.setFirstName(updateStudent.getFirstName());
		  dbStudent.setLastName(updateStudent.getLastName());
		  dbStudent.setBirthOfDate(updateStudent.getBirthOfDate());
		  
		 return studentRepository.save(dbStudent);
		  
	  }
	  
		return null;
	}


 




 

}
