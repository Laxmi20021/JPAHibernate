package com.xworkz.buses.runner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class FindMobileByBusName {

	public static void main(String[] args) {


		EntityManagerFactory emFactory = Persistence.createEntityManagerFactory("com");
		EntityManager eManager = emFactory.createEntityManager();
		EntityTransaction eTrans = eManager.getTransaction();
		
		Query query=eManager.createNamedQuery("findMobileByBusName");
		query.setParameter("getName", "VRL");
		Object obj= query.getSingleResult();
		Long ref= (Long)obj;
		System.out.println("Value of the mobile :"+ref);
		
		
		
		try {
			eTrans.begin();
			eTrans.commit();

		} catch (Exception e) {
			if (eTrans.isActive()) {
				eTrans.rollback();
			}
		} finally {
			eManager.close();
			emFactory.close();
		}


	}

}
