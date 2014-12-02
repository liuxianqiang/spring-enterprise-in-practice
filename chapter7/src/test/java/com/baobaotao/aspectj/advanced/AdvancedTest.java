package com.baobaotao.aspectj.advanced;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.baobaotao.NaiveWaiter;
import com.baobaotao.SmartSeller;
import com.baobaotao.Waiter;

public class AdvancedTest {
	public static void main(String[] args) {
		String configPath = "com/baobaotao/aspectj/advanced/beans.xml";
		ApplicationContext ctx = new ClassPathXmlApplicationContext(configPath);
		Waiter naiveWaiter = (Waiter) ctx.getBean("naiveWaiter");
		Waiter naughtyWaiter = (Waiter) ctx.getBean("naughtyWaiter");
		
		//--复合运算, 引用命名切点
		naiveWaiter.greetTo("John");
		naiveWaiter.serveTo("John");
		naughtyWaiter.greetTo("Tom");
		naughtyWaiter.serveTo("Tom");
		
        //--访问连接点对象
//		naiveWaiter.greetTo("John");
		
		//--绑定连接点参数
//		((NaiveWaiter)naiveWaiter).smile("John",2);
		
		//--绑定代理对象
//		naiveWaiter.greetTo("John");
		
		//--绑定类注解
//		((NaiveWaiter)naiveWaiter).greetTo("John");

		//--绑定返回值
//		SmartSeller seller = (SmartSeller) ctx.getBean("seller");
//		seller.sell("Beer","John");
		
		//--绑定异常
//		SmartSeller seller = (SmartSeller) ctx.getBean("seller");
//		seller.checkBill(1);
//		seller.checkBill(2);
	}
}
