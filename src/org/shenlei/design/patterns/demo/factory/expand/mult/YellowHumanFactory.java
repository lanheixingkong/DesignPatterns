package org.shenlei.design.patterns.demo.factory.expand.mult;

import org.shenlei.design.patterns.demo.factory.nvwa.Human;
import org.shenlei.design.patterns.demo.factory.nvwa.YellowHuman;

public class YellowHumanFactory extends AbstractHumanFactory {

	@Override
	public Human createHuman() {
		return new YellowHuman();
	}

}
