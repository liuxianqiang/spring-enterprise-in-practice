Spring3.x企业应用开发实践, chapter6
-------------
	Spring AOP 基础

技术点
-------------
	1.OOP(纵向抽取, 多个不同的点, 成一个点) vs AOP(横向抽取, 多个相同的点, 成一个点)
	2.AOP术语(连接点, 切点, 增强, 引介, 切面, 目标对象, 织入, 代理)
	3.AOP联盟, AOP的实现者(AspectJ, AspectWerkz, JBoss AOP, Spring AOP)
	4.JDK动态代理(InvocationHandler, Proxy), CGLIB&ASM动态代理(MethodInterceptor, Enhancer), Spring动态代理(Advice, ProxyFactory)
	5.Spring增强(前置增强, 后置增强, 环绕增强, 异常抛出增强, 引介增强) (根类: org.aopalliance.aop.Advice)
	6.Spring切点(静态方法切点, 动态方法切点, 注解切点, 表达式切点, 流程切点, 复合切点) (根类: org.springframework.aop.Pointcut)
	7.Spring切面(一般切面, 切点切面, 引介切面) (根类: org.springframework.aop.Advisor)
	8.Spring自动创建代理(基于Bean配置名规则, 基于Advisor匹配机制, 基于AspectJ注解机制) (根类: org.springframework.aop.framework.ProxyConfig)
	