package com.services;

import java.util.ArrayList;

import com.data.Customer;

public interface CustomerService {
	void addCustomerInfo(Customer customer);

	ArrayList<Customer> getCustmerDetails();

	void updateCustomerInfo(Customer customer);

	void deleteCustemerDetail(Customer customer);
}