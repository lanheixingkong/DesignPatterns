package org.shenlei.design.patterns.demo.proxy.aop;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class GamePlayerIH implements InvocationHandler{
	//被代理者
	Class cls = null;
	
	//被代理的实例
	Object obj = null;
	
	public GamePlayerIH(Object obj) {
		this.obj = obj;
	}
	
	@Override
	public Object invoke(Object proxy, Method method, Object[] args)
			throws Throwable {
		Object result = method.invoke(this.obj, args);
		//如果是登录方法，则发送消息提示
		if(method.getName().equalsIgnoreCase("login")){
			System.out.println("有人在用我的账号登录");
		}
		return result;
	}

}
