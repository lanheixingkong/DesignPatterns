package org.shenlei.design.patterns.demo.proxy.simple;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.shenlei.design.patterns.demo.proxy.game.IGamePlayer;

public class Client {

	public static void main(String[] args) {
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm");
		
		GamePlayerProxy proxy = new GamePlayerProxy("张三");
		System.out.println("开始时间是："+format.format(new Date()));
		proxy.login("ShenLei", "123456");
		proxy.killBoss();
		proxy.upgrade();
		System.out.println("结束时间是"+format.format(new Date()));
	}
	
	
}
