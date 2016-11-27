package org.shenlei.design.patterns.demo.factory.nvwa;

public abstract class AbstractHumanFactory {

	public abstract <T extends Human> T createHuman(Class<T> c);
}
