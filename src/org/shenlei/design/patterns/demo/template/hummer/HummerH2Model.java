package org.shenlei.design.patterns.demo.template.hummer;

public class HummerH2Model extends HummerModel{

	@Override
	public void start() {
		System.out.println("HummerH2 start");
	}

	@Override
	public void stop() {
		System.out.println("HummerH2 stop");
	}

	@Override
	public void alarm() {
		System.out.println("HummerH2 alarm");		
	}

	@Override
	public void engineBoom() {
		System.out.println("HummerH2 engineBoom");
	}

}
