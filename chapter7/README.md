Spring3.x企业应用开发实践, chapter7
-------------
	基于@AspectJ和Schema的AOP

技术点
-------------
	1.注解AOP, XML AOP (优先用"注解AOP")
	2.Java注解基础(@Interface, @Retention, @Target)
	3.@AspectJ语法基础(增强类型, 切点表达式, 切点函数, 切点函数入参, 切点逻辑运算符)
	4.@AspectJ进阶(切点复合运算, 命名切点, 增强织入的顺序, 访问连接点信息, 绑定连接点方法入参, 绑定目标对象或代理对象, 绑定类注解对象, 绑定返回值, 绑定抛出的异常)
	5.基于Schema配置切面(aop:config, aop:pointcut, aop:advisor, aop:aspect, aop:六大增强)
	6.切面类型(四种定义切面的方式: @AspectJ注解, <aop:aspect>, <aop:advisor>, Advisor类)
	7.LTW, Java Instrument, Spring LTW (类加载期AOP)