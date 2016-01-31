package com.data;


public class Customer {
	private String fname;
	private String lname;
	private String address;
	private String dob;
	private String passport_No;
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
		
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public String getPassport_No() {
		return passport_No;
	}
	public void setPassport_No(String passport_No) {
		this.passport_No = passport_No;
	}
}
