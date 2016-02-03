package com.services;

import java.sql.SQLException;
import java.util.ArrayList;

import com.data.Customer;

public interface CustomerService {
	void addCustomerInfo(Customer customer);

	ArrayList<Customer> getCustmerDetails() throws SQLException;

	void updateCustomerInfo(Customer customer);

	void deleteCustemerDetail(Customer customer);
}