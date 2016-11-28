package org.shenlei.design.patterns.demo.strategy;

public class ConcreteStrategy1 implements Strategy{

	@Override
	public void doSomething() {
		System.out.println("策略1的算法实现");
	}

}
