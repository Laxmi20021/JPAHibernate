package com.xworkz.UserId.runner;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import com.xworkz.UserId.Entity.EmployeeCard;
import com.xworkz.UserId.service.EmployeeCardService;
import com.xworkz.UserId.service.EmployeeCardServiceImpl;

public class NewRunner {

	public static void main(String[] args) {

		LocalDate customDate8=LocalDate.parse("14-04-2022", DateTimeFormatter.ofPattern("dd-MM-yyyy"));


		EmployeeCard employeeCard=new EmployeeCard(9,"Tesla Model S", "Tesla", 1234567890L, 22.5f, 100.0, true, 'E',customDate8, 5);
		
		EmployeeCardService service=new EmployeeCardServiceImpl();
		service.save(employeeCard);
	}

}
