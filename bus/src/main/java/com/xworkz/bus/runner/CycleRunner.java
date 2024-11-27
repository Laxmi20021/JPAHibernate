package com.xworkz.bus.runner;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.xworkz.bus.dto.CycleDto;


public class CycleRunner {

	public static void main(String[] args) {


		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("xworkz");
        EntityManager em = emf.createEntityManager();
        EntityTransaction et = em.getTransaction();
        
        List<CycleDto> cycleDto = new ArrayList<CycleDto>();
        
        
        cycleDto.add(new CycleDto(1,"Rohan",1500, "devshop", 1,"Shanku", 8, "ecity","9353132839","11"));
        cycleDto.add(new CycleDto(2,"dev",1000, "devshop", 2,"devu", 9, "banashankari","7545864952","12"));
        cycleDto.add(new CycleDto(3,"guru",900, "gurushop", 3,"guru", 7, "attibele","8877559966","13"));
        cycleDto.add(new CycleDto(4,"pavan",1100, "pavanshop", 4,"pavan", 7, "hubli","7744553322","14"));
        cycleDto.add(new CycleDto(5,"rakesh",1500, "rakeshshop", 5,"rakesh", 8, "chandapura","9972103442","15"));
        cycleDto.add(new CycleDto(6,"ravi",1300, "ravishop", 6,"ravii", 7, "gadag","7760004871","16"));
        cycleDto.add(new CycleDto(7,"sangu",1400, "sangushop", 7,"sangu", 8, "haveri","9972225778","17"));
        cycleDto.add(new CycleDto(8,"rohit",1500, "rohitshop", 8,"rohit", 5, "davanagere","6360103873","18"));
        cycleDto.add(new CycleDto(9,"manju",2000, "manjushop", 9,"manju", 7, "durga","7722331144","19"));
        cycleDto.add(new CycleDto(10,"shankar",1200, "shankarshop", 10,"shankar", 6, "belagavi","886655332244","20"));
        cycleDto.add(new CycleDto(11,"somesh",1700, "someshshop", 11,"somesh", 10, "birur","9988774455","21"));
        cycleDto.add(new CycleDto(12,"abhi",1800, "abhishop", 12,"abhi", 6, "mandya","7766554422","22"));
        cycleDto.add(new CycleDto(13,"darshan",1900, "darshanshop", 13,"darshan", 8, "mysoure","7744990022","23"));
        cycleDto.add(new CycleDto(14,"jhon",1540, "jhonshop", 14,"jhon",7, "bijapur","7733221144","24"));
        cycleDto.add(new CycleDto(15,"vittal",900, "vittalshop", 15,"vittal", 5, "bagalkot","6360140829","25"));


        try {
            et.begin();
            for (CycleDto cycles : cycleDto) {
                em.persist(cycles);
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
