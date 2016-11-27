package org.shenlei.design.patterns.demo.template.hummer;

public class HummerH1Model extends HummerModel{

	@Override
	public void start() {
		System.out.println("HummerH1 start");
	}

	@Override
	public void stop() {
		System.out.println("HummerH1 stop");
	}

	@Override
	public void alarm() {
		System.out.println("HummerH1 alarm");		
	}

	@Override
	public void engineBoom() {
		System.out.println("HummerH1 engineBoom");
	}

}
