package org.shenlei.design.patterns.demo.proxy.dynamic.cglib;

import java.lang.reflect.Method;

import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

public class MyMethodInterceptor implements MethodInterceptor {
	// 实现MethodInterceptor接口方法
	@Override
	public Object intercept(Object obj, Method method, Object[] args,
			MethodProxy proxy) throws Throwable {
		// 通过代理类调用父类中的方法
		return proxy.invokeSuper(obj, args);
	}

}
