package org.shenlei.design.patterns.demo.proxy.game;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Client {

	public static void main(String[] args) {
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm");
		
		IGamePlayer player = new GamePlayer("Lei");
		System.out.println("开始时间是："+format.format(new Date()));
		player.login("ShenLei", "123456");
		player.killBoss();
		player.upgrade();
		System.out.println("结束时间是"+format.format(new Date()));
		
		GamePlayerProxy proxy = new GamePlayerProxy(player);
		System.out.println("开始时间是："+format.format(new Date()));
		proxy.login("ShenLei", "123456");
		proxy.killBoss();
		proxy.upgrade();
		System.out.println("结束时间是"+format.format(new Date()));
	}
	
	
}
