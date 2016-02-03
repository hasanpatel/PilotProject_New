package com.services;

import java.sql.SQLException;
import java.util.ArrayList;

import com.appCtx.ApplicationContextHolder;
import com.dao.CustomerDao;
import com.dao.CustomerDaoImpl;
import com.data.Customer;

public class CustomerServiceImpl implements CustomerService {

	@Override
	public void addCustomerInfo(Customer customer) {

		CustomerDao dao = (CustomerDao)ApplicationContextHolder.getAppCtx().getBean(CustomerDao.class.getName());
		try {
			dao.InsertCustomerInfo(customer);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	@Override
	public ArrayList<Customer> getCustmerDetails()throws SQLException {
		// TODO Auto-generated method stub
		return new CustomerDaoImpl().getCustomerInfo();
	}

	@Override
	public void updateCustomerInfo(Customer customer) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteCustemerDetail(Customer customer) {
		// TODO Auto-generated method stub

	}

}
