package org.shenlei.design.patterns.demo.proxy.simple;

import org.shenlei.design.patterns.demo.proxy.game.IGamePlayer;

public class GamePlayerProxy implements IGamePlayer{
	private IGamePlayer gamePlayer;
	
	public GamePlayerProxy(String name) {
		try{
			gamePlayer = new GamePlayer(this, name);
		}catch(Exception e){
			//TODO
		}
	}

	@Override
	public void login(String user, String password) {
		this.gamePlayer.login(user, password);
	}

	@Override
	public void killBoss() {
		this.gamePlayer.killBoss();
	}

	@Override
	public void upgrade() {
		this.gamePlayer.upgrade();
	}

}
