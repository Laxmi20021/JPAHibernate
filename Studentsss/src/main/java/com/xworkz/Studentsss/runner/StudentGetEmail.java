package com.xworkz.Studentsss.runner;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class StudentGetEmail {

	public static void main(String[] args) {


		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("com");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();

		List<String> emails = 
				em.createQuery("SELECT l.email FROM StudentDto l WHERE l.name LIKE 'S%' OR l.name LIKE 'N%'", String.class)
				.getResultList();
		for (String email : emails) {
			System.out.println("Email: " + email);
		}

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
