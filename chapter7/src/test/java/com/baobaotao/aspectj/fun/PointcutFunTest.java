package com.baobaotao.aspectj.fun;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.baobaotao.NaiveWaiter;
import com.baobaotao.NaughtyWaiter;
import com.baobaotao.Seller;
import com.baobaotao.Waiter;
import com.baobaotao.WaiterManager;

public class PointcutFunTest {
	public static void main(String[] args) {

		
		String configPath = "com/baobaotao/aspectj/fun/beans.xml";
		ApplicationContext ctx = new ClassPathXmlApplicationContext(configPath);
		Waiter naiveWaiter = (Waiter) ctx.getBean("naiveWaiter");
		Waiter naughtyWaiter = (Waiter) ctx.getBean("naughtyWaiter");
		
		//-----execution, @annotation, args ------//
		naiveWaiter.greetTo("John");
		naiveWaiter.serveTo("John");
		naughtyWaiter.greetTo("Tom");
		naughtyWaiter.serveTo("Tom");
		((NaughtyWaiter)naughtyWaiter).joke("Tom", 1);

		
		//-----@args------//
//		WaiterManager wm = (WaiterManager)ctx.getBean("waiterManager");		
//		NaiveWaiter waiter3 = new NaiveWaiter();
//		NaiveWaiter waiter4 = (NaiveWaiter) ctx.getBean("naiveWaiter");
//		NaiveWaiter waiter5 = new NaiveWaiter();
//		wm.addNaiveWaiter(waiter3);
//		wm.addWaiter(waiter4);
//		wm.addNaiveWaiter(waiter5);
		
		//---------with, @within------------//
//		naughtyWaiter.greetTo("Tom");
//		((NaughtyWaiter)naughtyWaiter).joke("Tom", 1);
//		naiveWaiter.greetTo("John");
//		((NaiveWaiter)naiveWaiter).smile("John",2);

		//--------在引入Seller接口增强时，使用this() --------//
//		naiveWaiter.greetTo("John");
//		naiveWaiter.serveTo("John");
//		((Seller)naiveWaiter).sell("Beer", "John");
		
	}
}
