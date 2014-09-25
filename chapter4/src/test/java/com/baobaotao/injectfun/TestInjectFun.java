package com.baobaotao.injectfun;

import junit.framework.TestCase;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestInjectFun  extends TestCase {
	public ApplicationContext factory = null;

	private static String[] CONFIG_FILES = { "com/baobaotao/injectfun/beans.xml" };
	public void setUp() throws Exception {
		factory = new ClassPathXmlApplicationContext(CONFIG_FILES);
		
	}
	
	public void testLookup(){
		MagicBoss mboss1 = (MagicBoss) factory.getBean("lookupBoss1");
		assertNotSame(mboss1.getCar(),mboss1.getCar());
		System.out.println(mboss1.getCar().getBrand());
		
		MagicBoss mboss2 = (MagicBoss) factory.getBean("lookupBoss2");
		assertNotSame(mboss2.getCar(),mboss2.getCar());
		System.out.println(mboss2.getCar().getBrand());
		
	}
	public void testReplace(){
		MagicBoss mboss1 = (MagicBoss) factory.getBean("replaceBoss1");
		assertEquals(mboss1.getCar().getBrand(),"美人豹");
		
		MagicBoss mboss2 = (MagicBoss) factory.getBean("replaceBoss2");
		assertEquals(mboss2.getCar().getBrand(),"美人豹");
	}
	
}
