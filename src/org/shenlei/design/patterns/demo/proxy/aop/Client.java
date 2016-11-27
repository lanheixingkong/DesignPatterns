package org.shenlei.design.patterns.demo.proxy.aop;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Client {

	public static void main(String[] args) {
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm");
		
		IGamePlayer player = new GamePlayer("Lei");
		//定义一个Handler
		InvocationHandler handler = new GamePlayerIH(player);
		System.out.println("开始时间是："+format.format(new Date()));
		
		//获得类的ClassLoader
		ClassLoader cl = player.getClass().getClassLoader();
		//动态产生一个代理者
		IGamePlayer proxy = (IGamePlayer)Proxy.newProxyInstance(cl, new Class[]{IGamePlayer.class}, handler);
		proxy.login("张三", "password");
		proxy.killBoss();
		proxy.upgrade();
		System.out.println("结束时间是"+format.format(new Date()));
	}
	
	
}
