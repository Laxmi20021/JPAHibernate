package com.xworkz.UserId.runner;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.xworkz.UserId.Entity.EmployeeCard;

public class findAllByIdAndModelName {

	public static void main(String[] args) {
		
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("com");
		EntityManager entityManager=emf.createEntityManager();
		EntityTransaction et=entityManager.getTransaction();
		Query query=entityManager.createNamedQuery("findAllByIdAndModelName");
		query.setParameter("byId", 3).setParameter("bylModelName", "BMW i8");
		List<EmployeeCard> list=query.getResultList();
		for(EmployeeCard ve:list)
		   System.out.println(ve.toString());
		try
		{
			et.begin();
			et.commit();
		}
		catch(Exception e)
		{
			e.getMessage();
		}
		finally {
			emf.close();
			entityManager.close();
		}

	}

}
