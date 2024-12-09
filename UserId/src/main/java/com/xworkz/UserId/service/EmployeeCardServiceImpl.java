package com.xworkz.UserId.service;

import com.xworkz.UserId.Entity.EmployeeCard;
import com.xworkz.UserId.Repo.EmployeeCardRepo;
import com.xworkz.UserId.Repo.EmployeeCardRepoImpl;

public class EmployeeCardServiceImpl implements EmployeeCardService{

	
		@Override
		public boolean save(EmployeeCard dto) {
			System.out.println("EmployeeCard:"+dto.toString());
			EmployeeCardRepo repo=new EmployeeCardRepoImpl();
			repo.Save(dto);
		return false;
	}
	
	

}
