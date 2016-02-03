package com.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import com.data.Customer;

//import java.sql.Date.valueOf(java.lang.String);

public class CustomerDaoImpl implements CustomerDao {
	private Connection connection;

	@Override
	public void InsertCustomerInfo(Customer customer) throws SQLException {

		try {
			getConnection();
			connection.setAutoCommit(false);
			String sql = "INSERT INTO CUSTOMER(fname,lname,address,dob,passportNo) values(?,?,?,(select STR_TO_DATE(?, '%d-%m-%Y') from dual),?)";
			PreparedStatement prepaidStatement = connection
					.prepareStatement(sql);
			prepaidStatement.setString(1, customer.getFname());
			prepaidStatement.setString(2, customer.getLname());
			prepaidStatement.setString(3, customer.getAddress());
			prepaidStatement.setString(4, customer.getDob().toString());
			prepaidStatement.setString(5, customer.getPassport_No());
			prepaidStatement.executeUpdate();
			connection.commit();
		} catch (Exception e) {
			throw new SQLException(e);
		} finally {
			
		}
	}

	@Override
	public ArrayList<Customer> getCustomerInfo() throws SQLException {
		try {
			getConnection();
			String sql = "select * from customer";
			Statement statement = connection.createStatement();
			ResultSet resultSet = statement.executeQuery(sql);
			ArrayList<Customer> customer = new ArrayList<>();
			Customer tempCust;
			while (resultSet.next()) {
				tempCust = new Customer();
				tempCust.setFname(resultSet.getString("fname"));
				tempCust.setLname(resultSet.getString("lname"));
				tempCust.setAddress(resultSet.getString("address"));
				tempCust.setDob(resultSet.getString("dob"));
				tempCust.setPassport_No(resultSet.getString("passportNo"));
				customer.add(tempCust);
			}
			return customer;
		} catch (SQLException ee) {
				throw ee;
		} finally {

		}
		
	}

	private void getConnection() {
		try {
			if (connection != null)
				return;
			Class.forName("com.mysql.jdbc.Driver");
			connection = DriverManager.getConnection(
					"jdbc:mysql://localhost/PilotProject", "root", "");
		} catch (Exception e) {

		}
	}

}
