package com.xworkz.Studentsss.runner;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.xworkz.Studentsss.dto.StudentDto;

public class StudentGetAll {

	public static void main(String[] args) {


		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("com");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();

		List<StudentDto> list = em.createQuery("select l from StudentDto l", StudentDto.class).getResultList();
		for (StudentDto studentDto : list) {
			System.out.println("student list ===" + studentDto.getId() + "===" + studentDto.getName() + "==="
					+ studentDto.getEmail() + "===" + studentDto.getPassword() + "===" + studentDto.getAddress() + "==="
					+ studentDto.getPhoneNumber()+"==="+studentDto.getAge());

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


