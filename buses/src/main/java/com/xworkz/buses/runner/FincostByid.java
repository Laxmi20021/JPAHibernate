package com.xworkz.buses.runner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class FincostByid {

	public static void main(String[] args) {


		
		EntityManagerFactory emFactory = Persistence.createEntityManagerFactory("com");
		EntityManager eManager = emFactory.createEntityManager();
		EntityTransaction eTrans = eManager.getTransaction();
		
		Query query = eManager.createNamedQuery("findCostById");
		query.setParameter("setId",10 );
		Object obj = query.getSingleResult();
		Double ref = (Double) obj;
		System.out.println("Cost :" + ref);
		
		
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
