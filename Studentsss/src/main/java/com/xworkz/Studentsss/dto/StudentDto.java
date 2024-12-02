package com.xworkz.Studentsss.dto;

import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "student_table")
public class StudentDto {
	
	
	@Id
    //@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
    private String name;
    private String email;
    private String password;
    private String phoneNumber;
    private String address;
    private int age;
    
    public StudentDto()
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
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	/**
	 * @param id
	 * @param name
	 * @param email
	 * @param password
	 * @param phoneNumber
	 * @param address
	 * @param age
	 */
	public StudentDto(int id, String name, String email, String password, String phoneNumber, String address, int age) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.password = password;
		this.phoneNumber = phoneNumber;
		this.address = address;
		this.age = age;
	}
    
	
    
    


}
