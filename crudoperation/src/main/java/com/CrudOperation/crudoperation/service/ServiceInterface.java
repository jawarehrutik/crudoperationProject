package com.CrudOperation.crudoperation.service;

import java.util.List;
import java.util.Optional;

import com.CrudOperation.crudoperation.entity.Student;

public interface ServiceInterface {

	public Student save(Student std);
	public List<Student> getAll();
	public void deleteById(int id);
	public Optional<Student> findbyStudentId(int id);
	public void deleteAll();
	
	
	
}
