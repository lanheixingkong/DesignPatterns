package org.shenlei.design.patterns.demo.proxy.game;

public interface IGamePlayer {

	public void login(String user, String password);
	
	public void killBoss();
	
	public void upgrade();
}
