package com.me.services;

import java.lang.reflect.Method;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.aop.MethodBeforeAdvice;

import com.me.business.Bank;

public class LogBeforeService implements MethodBeforeAdvice {

	@Override
	public void before(Method m, Object[] param, Object o) throws Throwable {
		System.out.println(m.getName());
		System.out.println(o.toString());
		System.out.println(param);
		Log l = LogFactory.getLog(Bank.class);
		l.info("Executing Service before Deposite Method");
	}
}
