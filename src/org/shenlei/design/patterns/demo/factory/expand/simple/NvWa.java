package org.shenlei.design.patterns.demo.factory.expand.simple;

import org.shenlei.design.patterns.demo.factory.nvwa.BlackHuman;
import org.shenlei.design.patterns.demo.factory.nvwa.Human;
import org.shenlei.design.patterns.demo.factory.nvwa.WhiteHuman;
import org.shenlei.design.patterns.demo.factory.nvwa.YellowHuman;

public class NvWa {
	
	public static void main(String[] args) {
		System.out.println("--造出的第一批人是白色人种--");
		Human whiteHuman = SimpleHumanFactory.createHuman(WhiteHuman.class);
		whiteHuman.getColor();
		whiteHuman.talk();
		System.out.println("--造出的第二批人是黑色人种--");
		Human blackHuman = SimpleHumanFactory.createHuman(BlackHuman.class);
		blackHuman.getColor();
		blackHuman.talk();
		System.out.println("--造出的第三批人是黄色人种--");
		Human yellowHuman = SimpleHumanFactory.createHuman(YellowHuman.class);
		yellowHuman.getColor();
		yellowHuman.talk();
	}
}
