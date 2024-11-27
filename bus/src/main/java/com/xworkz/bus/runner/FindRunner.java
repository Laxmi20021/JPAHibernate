package com.xworkz.bus.runner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.xworkz.bus.dto.CycleDto;

public class FindRunner {

	public static void main(String[] args) {


		EntityManagerFactory emf = Persistence.createEntityManagerFactory("xworkz");
        EntityManager em = emf.createEntityManager();
        EntityTransaction et = em.getTransaction();
        
        
        
        Integer id = 1;
        Integer id1 =2;
        Integer id2 = 3;
        
        CycleDto cycle = em.find(CycleDto.class, id);
        CycleDto cycle1 = em.find(CycleDto.class, id1);
        CycleDto cycle2 = em.find(CycleDto.class, id2);

        
        System.out.println("cycle==" + cycle.getShopname());
        System.out.println("cycle==" + cycle1.getName());
        System.out.println("cycle==" + cycle2.getShopowner());


        try {
            et.begin();
            
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
		
	}

}
