package org.shenlei.design.patterns.demo.factory.expand.mult;

import org.shenlei.design.patterns.demo.factory.nvwa.BlackHuman;
import org.shenlei.design.patterns.demo.factory.nvwa.Human;

public class BlackHumanFactory extends AbstractHumanFactory {

	@Override
	public Human createHuman() {
		return new BlackHuman();
	}

}
