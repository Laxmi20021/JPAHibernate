package com.xworkz.UserId.Repo;

import java.util.List;

import com.xworkz.UserId.Entity.EmployeeCard;

public interface EmployeeCardRepo {
	
    boolean Save(EmployeeCard dto);
	List<EmployeeCard> findAll();
	
	List<Object[]> findNameAndManufacturerById(int id);
	
	String findNameById(int id);
	
	List<EmployeeCard> findAllByIdAndModelName(int id,String ModelName);

	 


}
