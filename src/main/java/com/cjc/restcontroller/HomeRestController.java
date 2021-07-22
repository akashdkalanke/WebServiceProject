package com.cjc.restcontroller;


import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.cjc.model.Student;
import com.cjc.service.HomeService;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

@RestController
@CrossOrigin("*")
public class HomeRestController 
{
	@Autowired
	HomeService hs;
	@PostMapping("/save")
	public ResponseEntity<?> saveStudentProfile(@RequestParam("file") MultipartFile file,@RequestParam("user") String user) throws IOException
	{
	
		Student student= new ObjectMapper().readValue(user,Student.class);
		student.setLogo(file.getBytes());
		student.setFileName(file.getOriginalFilename());
		Student stu=hs.saveData(student);
		if(stu!=null)
		{
			return new ResponseEntity<>("Student Save Successfully",HttpStatus.OK);
		}
		else
		{
			return new ResponseEntity<>("Student is Not Save",HttpStatus.BAD_REQUEST);
		}

}
	@GetMapping("/get/{imagename}")
public ResponseEntity<?> getImage(@PathVariable("imagename") String imagename)
{
Student stu=	hs.getImage(imagename);
if(stu!=null)
{
	return new ResponseEntity<Student>(stu,HttpStatus.OK);
}
else
{
	return new ResponseEntity<String>("Proble During Loading Image",HttpStatus.BAD_REQUEST);
}
}
	
}
