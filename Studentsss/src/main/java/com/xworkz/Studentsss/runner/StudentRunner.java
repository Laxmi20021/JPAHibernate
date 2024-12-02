package com.xworkz.Studentsss.runner;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.xworkz.Studentsss.dto.StudentDto;


public class StudentRunner {

	public static void main(String[] args) {


		 EntityManagerFactory emf = Persistence.createEntityManagerFactory("com");
	        EntityManager em = emf.createEntityManager();
	        EntityTransaction et = em.getTransaction();

	        List<StudentDto> students = new ArrayList<>();

	        students.add(new StudentDto(1,"Laxmi", "lax@gmail.com", "lax@123", "9972103442", "hubli", 22));
	        students.add(new StudentDto(2,"yashoda", "yashu@gmail.com", "yashu@123", "7760004871", "Gadag", 49));
	        students.add(new StudentDto(3,"Rakshit", "rakshit@gmail.com", "rakshit@123", "6360103873", "dharwad", 20));
	        students.add(new StudentDto(4,"Rohit", "rohit@gmail.com", "rohit@123", "9972225778", "Rona", 28));
	        students.add(new StudentDto(5,"Raju", "raju@gmail.com", "raju@123", "8088963214", "Gadag", 27));
	        students.add(new StudentDto(6,"Rakesh", "rakesh@gmail.com", "rakesh@123", "9988774455", "Delhi", 21));
	        students.add(new StudentDto(7,"Somesh", "somu@gmail.com", "somu@123", "7744112255", "Ranebennur", 25));
	        students.add(new StudentDto(8,"Ravi", "Ravi@gmail.com", "Ravi@123", "7411455638", "Haveri", 35));
	        students.add(new StudentDto(9,"Vaishanvi", "Vaishanvi@gmail.com", "Vaishanvi@123", "8722946945", "Belagavi", 20));
	        students.add(new StudentDto(10,"Sneha", "Sneha@gmail.com", "Sneha@123", "8899663355", "Chikkodi", 19));
	        students.add(new StudentDto(11, "Nidhu", "nidhu@gmail.com","nidhu@123","8822331144", "Bengaluru", 22));

	        try {
	            et.begin();
	            for (StudentDto details : students) {
	                em.persist(details);
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
