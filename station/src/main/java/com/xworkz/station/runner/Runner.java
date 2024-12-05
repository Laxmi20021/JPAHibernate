package com.xworkz.station.runner;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.xworkz.station.dto.StationDto;

public class Runner {

	public static void main(String[] args) {


		
		
		EntityManagerFactory emFactory=Persistence.createEntityManagerFactory("com");
		EntityManager eManager=emFactory.createEntityManager();
		EntityTransaction eTrans=eManager.getTransaction();
		
		List<StationDto> list=new ArrayList<StationDto>();
		list.add(new StationDto(1,"rani chennamma", 1500, "bengaluru","sleeper"));
		list.add(new StationDto(2,"hubli exp",1400, "HUbli","A/C"));
		list.add(new StationDto(3, "mumbai exp",2400, "mumbai","Sleeper"));
		list.add(new StationDto(4, "bengaluru exp",1200,"Benagaluru","A/C"));
		list.add(new StationDto(5, "MYsoure exp",2300,"Mysoure", "Sleeper"));
		list.add(new StationDto(6,"Mandy special", 1400, "Mandy","seating"));
		list.add(new StationDto(7, "hydrabad",4520,"hydrabad","A/C"));
		list.add(new StationDto(8,"Hampi exp",350,"bijapur","Sleeper"));
		list.add(new StationDto(9,"Jodpur Special",450,"Magestic","slepeer"));
		list.add(new StationDto(10,"jana shatbdi",210,"yeshwanthpur","Semi slepeer"));
		list.add(new StationDto(11, "tumalur exp",470,"tumakur","sleeper"));
		
        for (StationDto stationDto : list) {
			
		    eManager.persist(stationDto);
		}
		
		try {
			eTrans.begin();
			eTrans.commit();
			
		} catch (Exception e) {
			if(eTrans.isActive()) {
				eTrans.rollback();
			}
		}finally {
			eManager.close();
			emFactory.close();
		}

		
		
	}

}
