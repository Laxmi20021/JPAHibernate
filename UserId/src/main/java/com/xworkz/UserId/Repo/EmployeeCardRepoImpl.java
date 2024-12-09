package com.xworkz.UserId.Repo;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.xworkz.UserId.Entity.EmployeeCard;

public class EmployeeCardRepoImpl implements EmployeeCardRepo{

	@Override
	public boolean Save(EmployeeCard dto) {
		
		System.out.println("emoployeeCard:"+dto);
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("com");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
			try {
				et.begin();
				em.persist(dto);
				et.commit();
			} catch (Exception e) {
				e.printStackTrace();
				if (et.isActive()) {
					et.rollback();
				}
			} finally {
				em.close();
				emf.close();
			}
		
		return false;
	}
	
	

}
