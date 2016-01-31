package com.dataLocator;

import com.appCtx.ApplicationContextHolder;
import com.data.Customer;

public class DataLocator {
		public  static Customer getCustomer()
		{
			return (Customer)ApplicationContextHolder.getAppCtx().getBean(Customer.class.getName());
		}
}