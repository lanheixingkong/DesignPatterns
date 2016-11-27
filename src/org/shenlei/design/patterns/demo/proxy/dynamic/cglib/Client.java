package org.shenlei.design.patterns.demo.proxy.dynamic.cglib;

import net.sf.cglib.proxy.MethodInterceptor;

import org.shenlei.design.patterns.demo.proxy.dynamic.RealSubject;
import org.shenlei.design.patterns.demo.proxy.dynamic.Subject;

public class Client {

	public static void main(String[] args) {
		// 定义一个主题
		Subject subject = new RealSubject();
		// 定义一个Handler
		MethodInterceptor interceptor = new MyMethodInterceptor();
		// 定义主题的代理
		Subject proxy = DynamicProxy.newProxyInstance(subject.getClass(), interceptor);
		//代理的行为
		proxy.doSomething("Finish");
		
	}
}
