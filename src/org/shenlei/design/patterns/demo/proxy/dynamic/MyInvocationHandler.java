package org.shenlei.design.patterns.demo.proxy.dynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class MyInvocationHandler implements InvocationHandler{
	//被代理对象
	private Object target = null;
	
	//通过构造函数传递一个对象
	public MyInvocationHandler(Object obj) {
		this.target = obj;
	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args)
			throws Throwable {
		//执行被代理方法
		return method.invoke(target, args);
	}

	
}
