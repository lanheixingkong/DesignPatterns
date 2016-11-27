package org.shenlei.design.patterns.demo.template.hummer.extend;

public class HummerH2Model extends HummerModel{

	@Override
	protected void start() {
		System.out.println("HummerH2 start");
	}

	@Override
	protected void stop() {
		System.out.println("HummerH2 stop");
	}

	@Override
	protected void alarm() {
		System.out.println("HummerH2 alarm");		
	}

	@Override
	protected void engineBoom() {
		System.out.println("HummerH2 engineBoom");
	}

	@Override
	protected boolean isAlarm() {
		return false;
	}
	
	
}
