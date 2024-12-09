package com.xworkz.buses.runner;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.xworkz.buses.entity.BusEntity;


public class MainRunner {

	public static void main(String[] args) {

		
		EntityManagerFactory emFactory = Persistence.createEntityManagerFactory("com");
		EntityManager eManager = emFactory.createEntityManager();
		EntityTransaction eTrans = eManager.getTransaction();

		List<BusEntity> list = new ArrayList<BusEntity>();

		list.add(new BusEntity(1, 1520, "VRL","Patil@gmail.com", "Sleeper", 5000, 9972103442L));
		list.add(new BusEntity(2, 1620, "SUGUMA","laxmi@gmail.com", "Sleeper", 480, 9353132839L));
		list.add(new BusEntity(3, 1720, "AIRATAVA","yashu@gmail.com", "A/C", 5500, 7760004871L));
		list.add(new BusEntity(4, 1820, "GANESHA","veeru@gmail.com", "Sleeper", 750, 6360103873L));
		list.add(new BusEntity(5, 1920, "GOVERNMENT","Chaitrali@gmail.com", "A/C", 120, 9972225778L));
		list.add(new BusEntity(6, 2000, "RED","raju@gmail.com", "Semi-Sleeper", 800, 8722496945L));
		list.add(new BusEntity(7, 2020, "MINIBUS","darma@gmail.com", "Sleeper", 850, 99777885566L));
		list.add(new BusEntity(8, 3020, "MINICOACH","sneha@gmail.com", "A/C", 1320, 7744112255L));
		list.add(new BusEntity(9, 4020, "MINIBUS","darma@gmail.com", "Sleeper", 850, 99777885566L));
		list.add(new BusEntity(10, 5020, "DOUBLE_DUCKER_BUS","shweta@gmail.com", "Semi-Sleeper", 850, 7755663322L));


		
        for(BusEntity entity : list) {
			
			eManager.persist(entity);
		}
		
		try {
			
			eTrans.begin();
			eTrans.commit();
			
		} catch (Exception e) {
			
			if(eTrans.isActive()) {
				eTrans.rollback();
			}
			e.printStackTrace();
		}finally {
			emFactory.close();
			eManager.close();
		}

		
		
	}

}
