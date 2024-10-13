package com.accenture.UI;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.accenture.entity.EmployeeEntity;

public class UITester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EntityManagerFactory emf=  Persistence.createEntityManagerFactory("unit1");
		EntityManager em = emf.createEntityManager();
		
		EmployeeEntity ee = new EmployeeEntity();
		ee.setId(123);
		ee.setName("parul");
		em.getTransaction().begin();
		em.persist(ee);
		em.getTransaction().commit();
		em.close();
		emf.close();
		
		

	}

}
