package com.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.multiaction.MultiActionController;

import com.data.Customer;
import com.dataLocator.DataLocator;
import com.serviceLocator.ServiceLocator;
import com.services.CustomerService;
import com.services.CustomerServiceImpl;

public class CustomerController extends MultiActionController {

	public ModelAndView add(HttpServletRequest request,
			HttpServletResponse response) throws Exception {

		try {
			Customer customer =DataLocator.getCustomer();

			customer.setFname(request.getParameter("fname"));
			customer.setLname(request.getParameter("lname"));
			customer.setAddress(request.getParameter("address"));
			customer.setDob(request.getParameter("date"));
			customer.setPassport_No(request.getParameter("passportno"));

			CustomerService cusService = ServiceLocator.getCustomerService();
			cusService.addCustomerInfo(customer);

			ModelAndView modelAndView = new ModelAndView("redirect");
			modelAndView.addObject("customers", cusService.getCustmerDetails());

			return modelAndView;
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
	}
	

	public ModelAndView Delete(HttpServletRequest request,
			HttpServletResponse response) throws Exception {

		return new ModelAndView("CustomerPage", "msg", "delete() method");

	}

}