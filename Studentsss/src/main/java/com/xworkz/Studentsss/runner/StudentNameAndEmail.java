package com.xworkz.Studentsss.runner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class StudentNameAndEmail {

	public static void main(String[] args) {


		EntityManagerFactory emf = Persistence.createEntityManagerFactory("com");
        EntityManager em = emf.createEntityManager();
        EntityTransaction et = em.getTransaction();

        try {
            et.begin();
            em.createQuery("UPDATE StudentDto l SET l.name = :newName, l.email = :newEmail WHERE l.phoneNumber = '9972103442'")
              .setParameter("newName", "Lakshmi")
              .setParameter("newEmail", "Lakshmi@gmail.com")
              .executeUpdate();
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
