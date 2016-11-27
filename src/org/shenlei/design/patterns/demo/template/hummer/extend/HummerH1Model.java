package org.shenlei.design.patterns.demo.template.hummer.extend;

public class HummerH1Model extends HummerModel{
	private boolean alermFlag = true;

	@Override
	protected void start() {
		System.out.println("HummerH1 start");
	}

	@Override
	protected void stop() {
		System.out.println("HummerH1 stop");
	}

	@Override
	protected void alarm() {
		System.out.println("HummerH1 alarm");		
	}

	@Override
	protected void engineBoom() {
		System.out.println("HummerH1 engineBoom");
	}

	@Override
	protected boolean isAlarm() {
		return this.alermFlag;
	}
	
	public void setAlermFlag(boolean isAlarm) {
		this.alermFlag = isAlarm;
	}
}
