package com.accenture.lkm.service;

import java.util.Date;
import java.util.List;

import com.accenture.lkm.businessbean.CustomerBean;
import com.accenture.lkm.dao.CustomerDAO;
import com.accenture.lkm.utility.Factory;

public class CustomerServiceIMPL implements CustomerService {
	
	public Integer addCustomer(CustomerBean customer) throws Exception {

		int custID = 0;
		try {

			CustomerDAO customerDAO = Factory.createCustomerDAO();

			// your code  goes here
			custID = customerDAO.addCustomer(customer);
			
			

		} catch (Exception exception) {
			throw exception;
		}

		return custID;

	}

	
	public CustomerBean findCustomerById(Integer customerId) throws Exception {
		CustomerBean customerBeanRet =null;
		try {
			
			CustomerDAO employeeDAO = Factory.createCustomerDAO();

			customerBeanRet = employeeDAO.findCustomerById(customerId);

			if(customerBeanRet==null){
				throw new Exception("Given CustomerId is invalid, please try with a valid CustomerId");
			}
		} catch (Exception exception) {
			throw exception;
		}
		return customerBeanRet;
	}


	@Override
	public CustomerBean updateCustomerBillById(CustomerBean customerBean)throws Exception{
		CustomerBean customerBeanRet =null;
		try {
			
			CustomerDAO employeeDAO = Factory.createCustomerDAO();

			customerBeanRet = employeeDAO.updateCustomerBillById(customerBean);
			if(customerBeanRet==null){
				throw new Exception("Given CustomerId is invalid, please try with a valid CustomerId");
			}
		} catch (Exception exception) {
			throw exception;
		}
		return customerBeanRet;
	}


	
	


	@Override

	public CustomerBean deleteCustomerById(Integer customerId) throws Exception {

		CustomerBean customerBeanRet =null;

		try {

			CustomerDAO customerDAO = Factory.createCustomerDAO();

			customerBeanRet = customerDAO.deleteCustomerById(customerId);

			if(customerBeanRet==null){

				throw new Exception("Given CustomerId is invalid, please try with a valid CustomerId");

			}

 
			

			// your code  goes here

		} catch (Exception exception) {

			throw exception;

		}

		return customerBeanRet;

	}
 
	public List<CustomerBean> getCustomersWithinDateRange(Date lowerBound,Date upperBound) throws Exception{
//		List<CustomerBean> list=null;
//		try {
//			CustomerDAO cutomerDAO = Factory.createCustomerDAO();
//			
//			// your code goes here
//			
//			
//		} catch (Exception exception) {
//			throw exception;
//		}
//		return list;
		 List<CustomerBean> customerList = null;
	        try {
	        	CustomerDAO cutomerDAO = Factory.createCustomerDAO();
	            customerList = cutomerDAO.getCustomersWithinDateRange(lowerBound, upperBound);
	        } catch (Exception exception) {
	            throw new Exception("Error fetching customers within date range", exception);
	        }
	        return customerList;
	}
	
	
	
	public Integer updateCustomerBillByName(String name, Double bill)throws Exception{
		Integer ret=null;
		try {
			CustomerDAO cutomerDAO = Factory.createCustomerDAO();
		
			
			// your code goes here
			
		} catch (Exception exception) {
			throw exception;
		}
		return ret;
	}

}
