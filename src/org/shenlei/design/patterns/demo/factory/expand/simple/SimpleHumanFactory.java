package org.shenlei.design.patterns.demo.factory.expand.simple;

import org.shenlei.design.patterns.demo.factory.nvwa.Human;

public class SimpleHumanFactory {
	//简单工厂模式（静态工厂模式）
	public static <T extends Human> T createHuman(Class<T> c) {
		Human human = null;
		try{
			human = (T)Class.forName(c.getName()).newInstance();
		}catch(Exception e){
			System.out.println("人类生成错误");
		}
		return (T)human;
	}
}
