package com.CrudOperation.crudoperation.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.CrudOperation.crudoperation.entity.Student;

@Repository
public interface StudentDao extends JpaRepository<Student,Integer> {

}
