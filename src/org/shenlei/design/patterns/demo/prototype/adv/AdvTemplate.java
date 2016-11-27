package org.shenlei.design.patterns.demo.prototype.adv;

public class AdvTemplate {

	//广告信名称
	private String advSubject = "XX银行国庆信用卡抽奖活动";
	
	private String advContent = "国庆抽奖活动通知：只要刷卡就送你一百万！...";
	
	public String getAdvSubject() {
		return this.advSubject;
	}
	
	public String getAdvContent() {
		return this.advContent;
	}
}
