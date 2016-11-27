package org.shenlei.design.patterns.demo.absfactory.nvwa;

public class FemaleHumanFactory implements HumanFactory {

	@Override
	public Human createBlackHuman() {
		return new FemaleBlackHuman();
	}

	@Override
	public Human createWhiteHuman() {
		return new FemaleWhiteHuman();
	}

	@Override
	public Human createYellowHuman() {
		return new FemaleYellowHuman();
	}

	

}
