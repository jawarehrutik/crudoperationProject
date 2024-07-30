package com.CrudOperation.crudoperation.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.CrudOperation.crudoperation.dao.StudentDao;
import com.CrudOperation.crudoperation.entity.Student;

@Service
public class ServiceInterfeceImpl implements ServiceInterface {

	@Autowired
	private StudentDao studentdao;
	
	@Override
	public Student save(Student s) {
		return studentdao.save(s);
		
	}
	@Override
	public List<Student> getAll() {
		List<Student> list = studentdao.findAll();
		return list;
	}
	@Override
	public void deleteById(int id) {
		
		studentdao.deleteById(id);
		
	}
	@Override
	public Optional<Student> findbyStudentId(int id) {
		return studentdao.findById(id);
	
	}
	@Override
	public void deleteAll() {
		
		studentdao.deleteAll();
		
	}
	
	

}
