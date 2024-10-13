package com.accenture.lkm.dao;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;
import javax.transaction.Transaction;

import com.accenture.lkm.businessbean.CustomerBean;

import com.accenture.lkm.entity.CustomerEntity;
import com.accenture.lkm.utility.JPAUtility;

import sun.net.www.content.image.jpeg;

public class CustomerDAOIMPL implements CustomerDAO {

	
	
	public Integer addCustomer(CustomerBean customer) throws Exception {
		// TODO Auto-generated method stub
		Integer customerID = 0;
		EntityManager entityManager = null;
		try {
			EntityManagerFactory entityManagerFactory = JPAUtility.getEntityManagerFactory();
			entityManager = entityManagerFactory.createEntityManager();
			
			
			entityManager.getTransaction().begin();
			CustomerEntity employeeEntityBean = new CustomerEntity();
			employeeEntityBean.setCustomerName(customer.getCustomerName());
			employeeEntityBean.setCustomerId(customer.getCustomerId());
			employeeEntityBean.setBill(customer.getBill());
			employeeEntityBean.setPurchaseDate(customer.getPurchaseDate());

			entityManager.persist(employeeEntityBean);
			entityManager.getTransaction().commit();

			
			
			
			// Your Code goes here
			
			
			
		} catch (Exception exception) {

			throw exception;
		} finally {
			if (entityManager != null) {
				entityManager.close();
			}
		}

		return customerID;
	}

	public CustomerBean findCustomerById(Integer customerId) throws Exception {
		CustomerBean customer = null;
		EntityManager entityManager = null;
		try {
			EntityManagerFactory entityManagerFactory = JPAUtility.getEntityManagerFactory();
			entityManager = entityManagerFactory.createEntityManager();

			CustomerEntity customerEntity = (CustomerEntity) entityManager.find(CustomerEntity.class, customerId);

			if (customerEntity != null) {
				customer = new CustomerBean();
				customer.setBill(customerEntity.getBill());
				customer.setCustomerId(customerEntity.getCustomerId());
				customer.setCustomerName(customerEntity.getCustomerName());
				customer.setPurchaseDate(customer.getPurchaseDate());
			}

		} catch (Exception exception) {

			throw exception;
		} finally {
			if (entityManager != null) {
				entityManager.close();
			}
		}

		return customer;
	}

	public CustomerBean updateCustomerBillById(CustomerBean customerBean) throws Exception {
		CustomerBean customerRet = null;
		EntityManager entityManager = null;
		try {
			EntityManagerFactory entityManagerFactory = JPAUtility.getEntityManagerFactory();
			entityManager = entityManagerFactory.createEntityManager();

			CustomerEntity customerEntity = (CustomerEntity) entityManager.find(CustomerEntity.class, customerBean.getCustomerId());

			if (customerEntity != null) {
				
				entityManager.getTransaction().begin();
					customerEntity.setBill(customerBean.getBill());
				entityManager.getTransaction().commit();
				customerRet = new CustomerBean();
				customerRet.setBill(customerEntity.getBill());
				customerRet.setCustomerId(customerEntity.getCustomerId());
				customerRet.setCustomerName(customerEntity.getCustomerName());
				customerRet.setPurchaseDate(customerRet.getPurchaseDate());
			}

		} catch (Exception exception) {

			throw exception;
		} finally {
			if (entityManager != null) {
				entityManager.close();
			}
		}

		return customerRet;
	}

//	public CustomerBean deleteCustomerById(Integer customerId) throws Exception {
//		CustomerBean customerRet = null;
//		EntityManager entityManager = null;
//		try {
//			EntityManagerFactory emf = JPAUtility.getEntityManagerFactory();
//			EntityManager em = emf.createEntityManager();
//			
//			CustomerEntity customerEntitybean = (CustomerEntity) entityManager.find(CustomerEntity.class, customerId);
//			if(customerEntitybean !=null) {
//				em.getTransaction().begin();
//				em.remove(customerId);
//				em.getTransaction().commit();
//				
//				// Object to return
//				customerRet  = new CustomerBean();
//				customerRet.setCustomerId(customerEntitybean.getCustomerId());
//				customerRet.setBill(customerEntitybean.getBill());
//				customerRet.setCustomerName(customerEntitybean.getCustomerName());
//				customerRet.setPurchaseDate(customerEntitybean.getPurchaseDate());
//				
//			}
//			
//			
//		
//
//			
//			// Your Code goes here
//			
//			
//		} catch (Exception exception) {
//
//			throw exception;
//		} finally {
//			if (entityManager != null) {
//				entityManager.close();
//			}
//		}
//
//		return customerRet;
//	}

	public CustomerBean deleteCustomerById(Integer customerId) throws Exception {
		CustomerBean customerRet = null;
		EntityManager entityManager = null;
		try {
			EntityManagerFactory emf = JPAUtility.getEntityManagerFactory();
			EntityManager em = emf.createEntityManager();
			CustomerEntity customerEntityBean = (CustomerEntity) em.find(CustomerEntity.class,customerId );
			if(customerEntityBean!=null) {
			em.getTransaction().begin();
			em.remove(customerEntityBean);
			em.getTransaction().commit();
			customerRet = new CustomerBean();
			customerRet.setCustomerId(customerEntityBean.getCustomerId());
			customerRet.setCustomerName(customerEntityBean.getCustomerName());
			customerRet.setBill(customerEntityBean.getBill());
			customerRet.setPurchaseDate(customerEntityBean.getPurchaseDate());
			}
		} catch (Exception exception) {
			
						throw exception;
					} finally {
						if (entityManager != null) {
							entityManager.close();
						}
					}
			
					return customerRet;
				}
// 
	
	@Override
	public List<CustomerBean> getCustomersWithinDateRange(Date lowerBound,Date upperBound) throws Exception{
		List<CustomerBean> listCustomer = null;
		EntityManager entityManager = null;
		try {
			
			
//			 Your Code goes here
			EntityManagerFactory emf = JPAUtility.getEntityManagerFactory();
			EntityManager em = emf.createEntityManager();
			Query querry = em.createQuery("select k from CustomerEntity k where k.purchaseDate>?1 and k.purchaseDate<=?2");
			
			querry.setParameter(1, upperBound);
			querry.setParameter(1, lowerBound);
//
		    List<CustomerEntity> customerList = querry.getResultList();
			listCustomer = new ArrayList<CustomerBean>();
			for(CustomerEntity c:customerList) {
				CustomerBean customerBean = new CustomerBean();
				customerBean.setCustomerId(c.getCustomerId());
				customerBean.setCustomerName(c.getCustomerName());
				customerBean.setBill(c.getBill());
				customerBean.setPurchaseDate(c.getPurchaseDate());
				listCustomer.add(customerBean);
		}

			return listCustomer;
		 			
			
		} catch (Exception exception) {

			throw exception;
		} finally {
			if (entityManager != null) {
				entityManager.close();
			}
			

	@Override
	public Integer updateCustomerBillByName(String name,Double bill) throws Exception{
		Integer ret = null;
		EntityManager entityManager = null;
		try {

			// Your Code goes here
			EntityManagerFactory emf = JPAUtility.getEntityManagerFactory();
			EntityManager em = emf.createEntityManager();
			Query querry = entityManager.createQuery("Update CustomerEntity k set k.Bill where k.CustomerName =:p1");
			querry.setParameter(225500, bill);
			querry.setParameter("parul", name);
			em.getTransaction().begin();
			ret = querry.executeUpdate();
			em.getTransaction().commit();
						
		
			
			
		} catch (Exception exception) {

			throw exception;
		} finally {
			if (entityManager != null) {
				entityManager.close();
			}
		}

		return ret;
	}

}
