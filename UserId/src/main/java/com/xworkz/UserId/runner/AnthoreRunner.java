package com.xworkz.UserId.runner;


import java.util.List;

import com.xworkz.UserId.Entity.EmployeeCard;
import com.xworkz.UserId.service.EmployeeCardService;
import com.xworkz.UserId.service.EmployeeCardServiceImpl;

public class AnthoreRunner {

	public static void main(String[] args) {

		
		EmployeeCardService employeeCardService=new EmployeeCardServiceImpl();
		List<EmployeeCard> list=employeeCardService.findAll();
		System.out.println("list:"+list);
		
		System.out.println("-----------------");
		
		List<Object[]> list1=EmployeeCardService.findNameAndManufacturerById(5);
		System.out.println("nameAndManufacturer:"+list1);
		
		System.out.println("----------------");
		
		List<Object[]> string=EmployeeCardService.findNameAndManufacturerById(4);
		System.out.println("name:"+string);
		
		System.out.println("----------------------");
		
		String string1=EmployeeCardService.findNameById(5);
	    System.out.println("name:"+string1);
	    
	    System.out.println("=====================");
	    List<EmployeeCard> list2=   EmployeeCardService.findAllByIdAndModelName(3 , "BMW i8");
	    System.out.println("list2:"+list2);
		
	}

}
