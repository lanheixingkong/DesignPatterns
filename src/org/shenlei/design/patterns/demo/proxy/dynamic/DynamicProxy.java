package org.shenlei.design.patterns.demo.proxy.dynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

public class DynamicProxy<T> {
	public static <T> T newProxyInstance(ClassLoader loader,
			Class<?>[] interfaces, InvocationHandler handler) {
		// 寻找JoinPoint连接点，AOP框架使用元数据定义
		if (true) {
			//执行一个前置通知
			(new BeforeAdvice()).exec();
		}
		
		//执行目标并返回结果
		return (T)Proxy.newProxyInstance(loader, interfaces, handler);
	}

}
