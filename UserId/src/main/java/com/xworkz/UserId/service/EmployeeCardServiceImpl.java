package com.xworkz.UserId.service;

import java.util.List;

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

		@Override
		public List<EmployeeCard> findAll() {
			EmployeeCardRepo  employeeCardRepo= new EmployeeCardRepoImpl();
			List<EmployeeCard> list=employeeCardRepo.findAll();
			return list;
		}

		public List<Object[]> findNameAndManufacturerById(int id) {
			EmployeeCardRepo employeeCardRepo=new EmployeeCardRepoImpl();
			List<Object[]> list1=employeeCardRepo.findNameAndManufacturerById(id);
			
			return list1;
		}

		public String findNameById(int id) {

			EmployeeCardRepo employeeCardRepo=new EmployeeCardRepoImpl();
			String string=employeeCardRepo.findNameById(id);
					return string;
		}

		public List<EmployeeCard> findAllByIdAndModelName(int id, String ModelName) {

			EmployeeCardRepo employeeCardRepo=new EmployeeCardRepoImpl();
			List<EmployeeCard> list2=employeeCardRepo.findAllByIdAndModelName( id,  ModelName);
			return list2;
			
		}
	
	

		
		
}
