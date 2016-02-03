package com.dao;

import java.sql.SQLException;
import java.util.ArrayList;

import com.data.Customer;

public interface CustomerDao {

	ArrayList<Customer> getCustomerInfo() throws SQLException;

	void InsertCustomerInfo(Customer customer) throws SQLException;
}