package com.xworkz.bus.runner;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.xworkz.bus.dto.DriverDto;

public class DriverRunner {

	public static void main(String[] args) {


		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("xworkz");
        EntityManager em = emf.createEntityManager();
        EntityTransaction et = em.getTransaction();

        List<DriverDto> driverDto = new ArrayList<DriverDto>();
        
        driverDto.add(new DriverDto(1, "Rohan", 29, 25000, "bengaluru", "Karnataka", 8, "India", "banashankari","9353132839"));
        driverDto.add(new DriverDto(2, "Dev", 30, 22000, "bengaluru", "Karnataka", 7, "India", "magestic","9686754563"));
        driverDto.add(new DriverDto(3, "Sundanr", 28, 15000, "bengaluru", "Karnataka", 5, "India", "banashankari","7585966352"));
        driverDto.add(new DriverDto(4, "Dikshith", 27, 21000, "bengaluru", "Karnataka", 8, "India", "Ecity","8596744253"));
        driverDto.add(new DriverDto(5, "Ramu", 22, 20000, "bengaluru", "Karnataka", 6, "India", "banashankari","8785432686"));
        driverDto.add(new DriverDto(6, "guru", 25, 18000, "bengaluru", "Karnataka", 6, "India", "kanakpur","8875459652"));
        driverDto.add(new DriverDto(7, "manju", 24, 22000, "bengaluru", "Karnataka", 7, "India", "attibele","8586622134"));
        driverDto.add(new DriverDto(8, "rakesh", 28, 23000, "bengaluru", "Karnataka", 5, "India", "rajajinagar","7475963545"));
        driverDto.add(new DriverDto(9, "danraj", 29, 30000, "bengaluru", "Karnataka", 10, "India", "adagudi","9988775544"));
        driverDto.add(new DriverDto(10, "raju", 25, 21000, "bengaluru", "Karnataka", 7, "India", "koramangala","8752431645"));
        driverDto.add(new DriverDto(11, "pavan", 30, 20000, "bengaluru", "Karnataka", 4, "India", "silk board","7456321542"));
        driverDto.add(new DriverDto(12, "darshan", 22, 15000, "bengaluru", "Karnataka", 5, "India", "banashankari","7526489633"));
        driverDto.add(new DriverDto(13, "Dikshith", 27, 21000, "bengaluru", "Karnataka", 8, "India", "chandarupa","7142454361"));
        driverDto.add(new DriverDto(14, "Ramu", 22, 20000, "bengaluru", "Karnataka", 6, "India", "BTM","8191715161"));
        driverDto.add(new DriverDto(15, "gururaj", 28, 15000, "bengaluru", "Karnataka", 6, "India", "Kengeri","7282934251"));
        






        
        try {
            et.begin();
            for (DriverDto drivers : driverDto) {
                em.persist(drivers);
            }
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
