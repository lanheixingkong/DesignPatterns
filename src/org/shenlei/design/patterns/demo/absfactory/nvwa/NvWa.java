package org.shenlei.design.patterns.demo.absfactory.nvwa;

public class NvWa {
	
	public static void main(String[] args) {
		HumanFactory maleHumanFactory = new MaleHumanFactory();
		HumanFactory femalHumanFactory = new FemaleHumanFactory();
		System.out.println("--造出的第一批男人是白色人种--");
		Human whiteHuman = maleHumanFactory.createWhiteHuman();
		whiteHuman.getColor();
		whiteHuman.talk();
		whiteHuman.getSex();
		System.out.println("--造出的第二批男人是黑色人种--");
		Human blackHuman = maleHumanFactory.createBlackHuman();
		blackHuman.getColor();
		blackHuman.talk();
		blackHuman.getSex();
		System.out.println("--造出的第三批男人是黄色人种--");
		Human yellowHuman = maleHumanFactory.createYellowHuman();
		yellowHuman.getColor();
		yellowHuman.talk();
		yellowHuman.getSex();
		
		System.out.println("--造出的第一批女人是白色人种--");
		whiteHuman = femalHumanFactory.createWhiteHuman();
		whiteHuman.getColor();
		whiteHuman.talk();
		whiteHuman.getSex();
		System.out.println("--造出的第二批女人是黑色人种--");
		blackHuman = femalHumanFactory.createBlackHuman();
		blackHuman.getColor();
		blackHuman.talk();
		blackHuman.getSex();
		System.out.println("--造出的第三批女人是黄色人种--");
		yellowHuman = femalHumanFactory.createYellowHuman();
		yellowHuman.getColor();
		yellowHuman.talk();
		yellowHuman.getSex();
	}
}
