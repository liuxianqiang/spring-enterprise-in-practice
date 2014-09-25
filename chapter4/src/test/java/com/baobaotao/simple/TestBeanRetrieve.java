package com.baobaotao.simple;

import junit.framework.TestCase;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestBeanRetrieve extends TestCase {

	public ApplicationContext factory = null;

	private static String[] CONFIG_FILES = {
			"com/baobaotao/simple/beans.xml"};

	public void setUp() throws Exception {
		factory = new ClassPathXmlApplicationContext(CONFIG_FILES);
	}
	
	public void testBeanRetrieve(){
		System.out.println(factory.getBean("car0"));
		System.out.println(factory.getBean("firstcar"));
		System.out.println(factory.getBean("carone"));
		System.out.println(factory.getBean("carzero"));
		
		System.out.println(factory.getBean("com.baobaotao.simple.Car"));
		System.out.println(factory.getBean("com.baobaotao.simple.Car#0"));
		System.out.println(factory.getBean("com.baobaotao.simple.Car#1"));
	}
}
