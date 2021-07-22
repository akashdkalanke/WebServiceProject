package com.cjc.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cjc.model.Student;
import com.cjc.repository.HomeRepository;
import com.cjc.service.HomeService;
@Service
public class HomeServiceImpl implements HomeService 
{
	@Autowired
	HomeRepository hr;

	@Override
	public Student saveData(Student student) {
		
		return hr.save(student);
	}

	@Override
	public Student getImage(String imagename) {
		
		return hr.findByFileName(imagename);
	}
	
	

}
