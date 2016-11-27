package org.shenlei.design.patterns.demo.proxy.enhance;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Client {

	public static void main(String[] args) {
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm");
		
		IGamePlayer player = new GamePlayer("Lei");
		GamePlayerProxy proxy = new GamePlayerProxy(player);
		System.out.println("开始时间是："+format.format(new Date()));
		proxy.login("ShenLei", "123456");
		proxy.killBoss();
		proxy.upgrade();
		System.out.println("结束时间是"+format.format(new Date()));
	}
	
	
}
