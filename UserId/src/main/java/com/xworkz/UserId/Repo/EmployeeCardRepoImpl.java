package com.xworkz.UserId.Repo;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.xworkz.UserId.Entity.EmployeeCard;

public class EmployeeCardRepoImpl implements EmployeeCardRepo{

	@Override
	public boolean Save(EmployeeCard dto) {
		
		System.out.println("emoployeeCard:"+dto);
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("com");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
			try {
				et.begin();
				em.persist(dto);
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
		
		return false;
	}

	@Override
	public List<EmployeeCard> findAll() {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("com");
		EntityManager em= emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		
		List<EmployeeCard> list=null;
		Query query= em.createNamedQuery("findAll");
		list=query.getResultList();
		for (EmployeeCard employeeCard : list) {
			System.out.println("employeeCard:"+ employeeCard);
			
		}
		return null;
	}

	@Override
	public List<Object[]> findNameAndManufacturerById(int id) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("com");
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		
		List<Object[]> list1=null;
		Query query=em.createNamedQuery("findNameAndManufacturerById");
		query.setParameter("byid", id);
		list1=query.getResultList();
		for (Object[] objects : list1) {
			System.out.println("name: " +objects[0]);
			System.out.println("Manufacturer : " +objects[1]);
			
		}
		
		try {
			et.begin();
			et.commit();
		} catch (Exception e) {
			if(et.isActive())
			{
				et.rollback();
				e.printStackTrace();
			}
		}
		return list1;
	}

	
		public String findNameById(int id) {
			EntityManagerFactory emf=Persistence.createEntityManagerFactory("com");
		    EntityManager  em=emf.createEntityManager();
		 EntityTransaction et=  em.getTransaction();
		 
		
		 String string=null;
	       Query query= em.createNamedQuery("findNameById");
	        query.setParameter("getId", id);

	          Object obj=query.getSingleResult();
	           string=(String)obj;
	          

	  
		 try {
			 et.begin();
			 
			 et.commit();
		 }catch (Exception e) {
			if(et.isActive()) {
				et.rollback();
			}
		}finally {
			em.close();
			emf.close();

		}
		
			return string;
		}

		@Override
		public List<EmployeeCard> findAllByIdAndModelName(int id,String ModelName) {
			EntityManagerFactory emf=Persistence.createEntityManagerFactory("xworkz");
		    EntityManager em= emf.createEntityManager();
		     EntityTransaction et=  em.getTransaction();
		     
		     List<EmployeeCard> list2=null;
		     Query query=em.createNamedQuery("findAllByIdAndModelName");
		        query.setParameter("biid", id);
		        query.setParameter("bylModelName", ModelName);
		    list2= query.getResultList();
		    for (EmployeeCard employeeCard : list2) {
				System.out.println("employeeCard"+employeeCard);
			}
		    
		  
		
		  
		     try {
		    	 et.begin();
		    	 et.commit();
		     }catch (Exception e) {
				if(et.isActive()) {
					et.rollback();
					e.printStackTrace();
				}
			}finally {
				emf.close();
				em.close();
			}
			
		
		     return null;
		}
	

}
