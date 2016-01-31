package com.appCtx;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class ApplicationContextHolder implements ApplicationContextAware {

	static private ApplicationContext appCtx=null;
	@Override
	public void setApplicationContext(ApplicationContext arg0)
			throws BeansException {
		
		appCtx=arg0;
	}
	
	public static ApplicationContext getAppCtx() {
		return appCtx;
	}

}
