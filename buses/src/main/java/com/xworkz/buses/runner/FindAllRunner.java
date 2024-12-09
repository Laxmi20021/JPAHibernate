package com.xworkz.buses.runner;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.xworkz.buses.entity.BusEntity;

public class FindAllRunner {

	public static void main(String[] args) {


		
		EntityManagerFactory emFactory = Persistence.createEntityManagerFactory("com");
		EntityManager eManager = emFactory.createEntityManager();
		EntityTransaction eTrans = eManager.getTransaction();
		
		
		Query query = eManager.createNamedQuery("findAll");
		List<BusEntity> list = query.getResultList();
		list.forEach(ref -> System.out.println(ref));

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
