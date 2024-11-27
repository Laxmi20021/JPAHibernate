package com.xworkz.bus.dto;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="info_table")
public class CycleDto {
	
	 
	@Id
	private int id;
	private String name;
	private double cost;
	private String shopname;
	private int shopNo;
	private String shopowner;
	private double ratings;
	private String area;
	private String mobile;
	private String cycleNo;
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
	public double getCost() {
		return cost;
	}
	public void setCost(double cost) {
		this.cost = cost;
	}
	public String getShopname() {
		return shopname;
	}
	public void setShopname(String shopname) {
		this.shopname = shopname;
	}
	public int getShopNo() {
		return shopNo;
	}
	public void setShopNo(int shopNo) {
		this.shopNo = shopNo;
	}
	public String getShopowner() {
		return shopowner;
	}
	public void setShopowner(String shopowner) {
		this.shopowner = shopowner;
	}
	public double getRatings() {
		return ratings;
	}
	public void setRatings(double ratings) {
		this.ratings = ratings;
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
	public String getCycleNo() {
		return cycleNo;
	}
	public void setCycleNo(String cycleNo) {
		this.cycleNo = cycleNo;
	}
	/**
	 * @param id
	 * @param name
	 * @param cost
	 * @param shopname
	 * @param shopNo
	 * @param shopowner
	 * @param ratings
	 * @param area
	 * @param mobile
	 * @param cycleNo
	 */
	public CycleDto(int id, String name, double cost, String shopname, int shopNo, String shopowner, double ratings,
			String area, String mobile, String cycleNo) {
		super();
		this.id = id;
		this.name = name;
		this.cost = cost;
		this.shopname = shopname;
		this.shopNo = shopNo;
		this.shopowner = shopowner;
		this.ratings = ratings;
		this.area = area;
		this.mobile = mobile;
		this.cycleNo = cycleNo;
	}
	
	
	

}
