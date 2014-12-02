package com.baobaotao.aspectj.fun;

import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.Ordered;

/**
 * 说明：需要测试某个切点函数时，取消相应的注解就可以了。
 * 
 * @author 陈雄华
 * 
 */
@Aspect
public class TestAspect implements Ordered {
	// 方法切点函数
	@Before("execution(public * *(..))")
	public void allPublicFun() {
		System.out.println("allPublicFun() executed!");
	}
//
//	@AfterReturning("execution(* *To(..))")
//	public void allToFun() {
//		System.out.println("allToFun() executed!");
//	}
//
//	@Before("execution(* com.baobaotao.Waiter.*(..))")
//	public void allWaiterFun() {
//		System.out.println("allWaiterFun() executed!");
//	}
//
//	@Before("execution(* com.baobaotao..Waiter+.*(..))")
//	public void allChildClassFun() {
//		System.out.println("allChildClassFun() executed!");
//	}
//
//	@Before("execution(* joke(..))")
//	public void jokeFun() {
//		System.out.println("jokeFun() executed!");
//	}
//
//	@AfterReturning("@annotation(com.baobaotao.anno.NeedTest)")
//	public void atAnnotaionTest() {
//		System.out.println("atAnnotaionTest() executed!");
//	}

	
	// 方法入参切点函数
//	@AfterReturning("args(String)")
//	public void argsTest() {
//		System.out.println("argsTest() executed!");
//	}
//	
//	@AfterReturning("args(String, int)")
//	public void argsTest() {
//		System.out.println("argsTest() executed!");
//	}
//
//	@AfterReturning("@args(com.baobaotao.Monitorable)")
//	public void atArgsTest() {
//		System.out.println("atArgsTest() executed!");
//	}

	
	// 目标类切点函数
//	@Before("within(com.baobaotao.Waiter)")
//	public void withinTest() {
//		System.out.println("withinTest() executed!");
//	}
//
//	@Before("@within(com.baobaotao.Monitorable)")
//	public void atWithinTest() {
//		System.out.println("atWithinTest() executed!");
//	}

	
	// 代理类切点函数
//	@AfterReturning("this(com.baobaotao.Seller)")
//	public void thisTest() {
//		System.out.println("thisTest() executed!");
//	}

	public int getOrder() {
		// TODO Auto-generated method stub
		return 1;
	}
}
