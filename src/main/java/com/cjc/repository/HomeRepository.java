package com.cjc.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cjc.model.Student;
@Repository
public interface HomeRepository extends JpaRepository<Student,Integer> 
{

	Student findByFileName(String imagename);

}
