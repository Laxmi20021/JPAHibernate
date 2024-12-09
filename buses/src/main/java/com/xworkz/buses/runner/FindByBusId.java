package com.xworkz.buses.runner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.xworkz.buses.entity.BusEntity;

public class FindByBusId {

	public static void main(String[] args) {


		
		EntityManagerFactory emFactory = Persistence.createEntityManagerFactory("com");
		EntityManager eManager = emFactory.createEntityManager();
		EntityTransaction eTrans = eManager.getTransaction();

		
		Query query = eManager.createNamedQuery("findbyBusId");
		query.setParameter("bsId", 1620);

		Object obj = query.getSingleResult();
		BusEntity ref = (BusEntity) obj;
		System.out.println("Value of the Bus Id :" + ref);

		
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
