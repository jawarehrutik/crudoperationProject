package com.CrudOperation.crudoperation.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.service.annotation.DeleteExchange;

import com.CrudOperation.crudoperation.entity.Student;
import com.CrudOperation.crudoperation.service.ServiceInterface;

@RestController
@RequestMapping("/student")
public class StudController {
	
	@Autowired
	private ServiceInterface serviceinterface;
	
	
	//Insert and upadate operation
	@PostMapping("/save")
	public Student save(@RequestBody Student std)
	{
		return serviceinterface.save(std);
	
		
	}
	
	//Get all data
	@GetMapping("/getall")
	public List<Student> getAll()
	{
		return serviceinterface.getAll();
		
		
	}
	
	//delete 
	@DeleteMapping("/{id}")
	public void deleteById(@PathVariable int id)
	{
		serviceinterface.deleteById(id);
		
	}
	
	//find by id
	@GetMapping("/{id}")
	public Optional<Student> findbyStudentId(@PathVariable int id){
		
		return serviceinterface.findbyStudentId(id);
	}
	
	//delete all data
	@DeleteMapping
	public void deleteAll()
	{
		serviceinterface.deleteAll();
	}
	
	
	
	
	
	

}
