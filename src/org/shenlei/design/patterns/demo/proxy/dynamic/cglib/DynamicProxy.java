package org.shenlei.design.patterns.demo.proxy.dynamic.cglib;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;

import org.shenlei.design.patterns.demo.proxy.dynamic.BeforeAdvice;

public class DynamicProxy<T> {

	public static <T> T newProxyInstance(Class<?> clazz,
			MethodInterceptor interceptor) {
		// 寻找JoinPoint连接点，AOP框架使用元数据定义
		if (true) {
			// 执行一个前置通知
			(new BeforeAdvice()).exec();
		}
		
		Enhancer enhancer = new Enhancer();
		// 设置需要创建子类的类
		enhancer.setSuperclass(clazz);
		enhancer.setCallback(interceptor);
		// 通过字节码技术动态创建子类实例
		return (T) enhancer.create();
	}

}
