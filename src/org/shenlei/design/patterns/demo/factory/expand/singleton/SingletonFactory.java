package org.shenlei.design.patterns.demo.factory.expand.singleton;

import java.lang.reflect.Constructor;

public class SingletonFactory {

	private static Singleton singleton;
	
	static {
		try{
			Class cls = Class.forName(Singleton.class.getName());
			//获得无参构造
			Constructor constructor = cls.getDeclaredConstructor();
			//设置无参构造是可访问的
			constructor.setAccessible(true);
			singleton = (Singleton)constructor.newInstance();
		}catch(Exception e){
			//异常处理
		}
	}
	
	public static Singleton getSingleton(){
		return singleton;
	}
}
