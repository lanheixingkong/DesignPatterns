package org.shenlei.design.patterns.demo.factory.expand.mult;

import org.shenlei.design.patterns.demo.factory.nvwa.Human;

public abstract class AbstractHumanFactory {

	/*
	 * 抽象方法中不再需要传递相关参数
	 * 因为每一个具体的工厂方法都已经明确自己的职责
	 * 
	 */
	public abstract Human createHuman();
}
