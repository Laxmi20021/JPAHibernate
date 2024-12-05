package com.xworkz.station.runner;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.xworkz.station.dto.StationDto;

public class MainRunner {

	public static void main(String[] args) {


		EntityManagerFactory emFactory=Persistence.createEntityManagerFactory("com");
		EntityManager eManager=emFactory.createEntityManager();
		EntityTransaction eTrans=eManager.getTransaction();
		
		Query query=eManager.createNamedQuery("findByTrainename");
		Object obj=query.getSingleResult();
		
		StationDto entity=(StationDto) obj;
		System.out.println("Value : "+entity.toString());
		System.out.println("yess getting");
		System.out.println("==========================");
		
		Query query2=eManager.createNamedQuery("findBycost");
		Object obj2=query2.getSingleResult();
		
		StationDto entity2=(StationDto) obj2;
		System.out.println("Value :"+entity2.toString());
		System.out.println("its coming");
		System.out.println("==========================");
		
		Query query3=eManager.createNamedQuery("findByid");
		Object obj3=query3.getSingleResult();
		
		StationDto entity3=(StationDto) obj3;
		System.out.println("Value :"+entity3.toString());
		System.out.println("its creating");
		System.out.println("==========================");
		
		Query query4=eManager.createNamedQuery("findByTrainename&cost");
		Object obj4= query4.getResultList();
		
		List<StationDto> res = query4.getResultList();
		
		for(StationDto dto : res) {
			System.out.println("Values :"+dto.getTrainename() + " , " + dto.getCost());
		}
		System.out.println("finally coming");
		System.out.println("==========================");
		
		Query query5=eManager.createNamedQuery("findBycost&sections");
		Object obj5=query5.getResultList();
		
		List<StationDto> res2=query5.getResultList();
		
		for(StationDto dto2 : res2) {
			System.out.println("Values :"+ dto2.getCost() + " , "+ dto2.getSections());
			System.out.println("==========================");
		}
		
		try {
			eTrans.begin();
			eTrans.commit();
			
		} catch (Exception e) {
			if(eTrans.isActive()) {
				eTrans.rollback();
			}
		}
		finally {
			eManager.close();
			emFactory.close();
		}
		
		
	}

}
