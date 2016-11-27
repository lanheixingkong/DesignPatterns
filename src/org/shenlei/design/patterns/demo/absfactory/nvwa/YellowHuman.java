package org.shenlei.design.patterns.demo.absfactory.nvwa;

public abstract class YellowHuman implements Human {

	@Override
	public void getColor() {
		System.out.println("黄色人种的皮肤颜色是黄色的");
	}

	@Override
	public void talk() {
		System.out.println("黄色人种会说话，一般人说的都是双字节。");
	}

}
