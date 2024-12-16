package com.xworkz.UserId.service;

import java.util.List;

import com.xworkz.UserId.Entity.EmployeeCard;

public interface EmployeeCardService {
	
	boolean save(EmployeeCard dto);
	
	List<EmployeeCard> findAll();
	
    static List<Object[]> findNameAndManufacturerById(int id) {
		// TODO Auto-generated method stub
		return null;
	}
	
    static String findNameById(int id) {
		// TODO Auto-generated method stub
		return null;
	}
	static List<EmployeeCard> findAllByIdAndModelName(int id,String ModelName) {
		// TODO Auto-generated method stub
		return null;
	}

    

}
