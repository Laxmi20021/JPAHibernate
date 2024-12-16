package com.xworkz.xworkz_course_registration.repository;

import com.xworkz.xworkz_course_registration.entity.CourseRegEntity;
import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.*;

public class CourseRegRepositoryImpl implements CourseRegRepository {

   @Autowired
   EntityManagerFactory entityManagerFactory;

    public CourseRegRepositoryImpl() {
        System.out.println("No-Args Const of CourseRegRepositoryImpl");
    }

    @Override

    public boolean onSend(CourseRegEntity entity) {
        System.out.println("Executing onSend in RepositoryImpl");
        System.out.println("REPO :"+entity);

        EntityManager entityManager =  entityManagerFactory.createEntityManager();
        EntityTransaction entityTransaction = entityManager.getTransaction();

        try{
            entityTransaction.begin();
            entityManager.persist(entity);
            entityTransaction.commit();

        }catch(Exception e){
            if(entityTransaction.isActive())
                entityTransaction.rollback();
        }finally{
            entityManager.close();
            entityManagerFactory.close();
        }
        return true;
    }

    @Override
    public CourseRegEntity findByEmail(String email) {
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        CourseRegEntity entity = null;

        try {
            Query query = entityManager.createNamedQuery("getByEmail");
            query.setParameter("byemail", email);
            entity = (CourseRegEntity) query.getSingleResult();
            System.out.println("REPO: " + entity);
        } catch (NoResultException e) {

            return null;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        } finally {
            entityManager.close();
        }

        return entity;
    }

}
