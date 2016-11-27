package org.shenlei.design.patterns.demo.proxy.enhance;

public class GamePlayerProxy implements IGamePlayer, IProxy{
	private IGamePlayer gamePlayer;
	
	public GamePlayerProxy(IGamePlayer gamePlayer) {
		this.gamePlayer = gamePlayer;
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
		this.count();
	}

	//计算费用
	@Override
	public void count() {
		System.out.println("升级总费用是：150元");
	}

}
