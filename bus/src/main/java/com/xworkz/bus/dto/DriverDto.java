package com.xworkz.bus.dto;

import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="information_table")
public class DriverDto {
	
	//@GeneratedValue(strategy = GenerationType.IDENTITY) 
	@Id
	private int id;
	private String drivername;
	private int age;
	private double salary;
	private String city;
	private String state;
	private double ratings;
	private String country;
	private String area;
	private String mobile;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDrivername() {
		return drivername;
	}
	public void setDrivername(String drivername) {
		this.drivername = drivername;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public double getRatings() {
		return ratings;
	}
	public void setRatings(double ratings) {
		this.ratings = ratings;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	/**
	 * @param id
	 * @param drivername
	 * @param age
	 * @param salary
	 * @param city
	 * @param state
	 * @param ratings
	 * @param country
	 * @param area
	 * @param mobile
	 */
	public DriverDto(int id, String drivername, int age, double salary, String city, String state, double ratings,
			String country, String area, String mobile) {
		super();
		this.id = id;
		this.drivername = drivername;
		this.age = age;
		this.salary = salary;
		this.city = city;
		this.state = state;
		this.ratings = ratings;
		this.country = country;
		this.area = area;
		this.mobile = mobile;
	}
	
	

}
