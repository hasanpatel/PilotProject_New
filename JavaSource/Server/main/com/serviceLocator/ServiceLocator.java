package com.serviceLocator;

import com.appCtx.ApplicationContextHolder;
import com.services.CustomerService;

public class ServiceLocator {
		public  static CustomerService getCustomerService()
		{
			return (CustomerService)ApplicationContextHolder.getAppCtx().getBean(CustomerService.class.getName());
		}
}
