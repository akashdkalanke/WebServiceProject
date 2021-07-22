package com.cjc.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;

@Entity
public class Student 
{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
private int id;
private String name;
private String email;
private String address;
private String username;
private String password;
@Lob
private byte[] logo;
private String fileName;
public Student()
{
	
}


public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public String getEmail() {
	return email;
}

public void setEmail(String email) {
	this.email = email;
}

public String getAddress() {
	return address;
}

public void setAddress(String address) {
	this.address = address;
}

public String getUsername() {
	return username;
}

public void setUsername(String username) {
	this.username = username;
}

public String getPassword() {
	return password;
}

public void setPassword(String password) {
	this.password = password;
}

public byte[] getLogo() {
	return logo;
}

public void setLogo(byte[] logo) {
	this.logo = logo;
}

public String getFileName() {
	return fileName;
}

public void setFileName(String fileName) {
	this.fileName = fileName;
}

public Student(int id, String name, String email, String address, String username, String password, byte[] logo,
		String fileName) {
	super();
	this.id = id;
	this.name = name;
	this.email = email;
	this.address = address;
	this.username = username;
	this.password = password;
	this.logo = logo;
	this.fileName = fileName;
}

}