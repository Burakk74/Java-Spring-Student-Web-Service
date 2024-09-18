package com.burakkucuk.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.burakkucuk.entites.Student;



@Repository
public interface StudentRepository extends JpaRepository<Student, Integer> {

	
	
	
}
