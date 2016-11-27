package org.shenlei.design.patterns.demo.factory.expand.mult;

import org.shenlei.design.patterns.demo.factory.nvwa.Human;
import org.shenlei.design.patterns.demo.factory.nvwa.WhiteHuman;

public class WhiteHumanFactory extends AbstractHumanFactory {

	@Override
	public Human createHuman() {
		return new WhiteHuman();
	}

}
