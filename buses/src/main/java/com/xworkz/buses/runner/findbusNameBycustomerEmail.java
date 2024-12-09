package com.xworkz.buses.runner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class findbusNameBycustomerEmail {

	public static void main(String[] args) {


		EntityManagerFactory emFactory = Persistence.createEntityManagerFactory("com");
		EntityManager eManager = emFactory.createEntityManager();
		EntityTransaction eTrans = eManager.getTransaction();
		
		Query query = eManager.createNamedQuery("findBusNamebyCustomerEmail");
		query.setParameter("getEmail", "patil@gmail.com");
		Object object = query.getSingleResult();
		String string = (String) object;
		System.out.println("Values : " + string);
		
		
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
