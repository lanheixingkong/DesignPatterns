package org.shenlei.design.patterns.demo.strategy.extend;

public class Add implements CalculatorStrategy{

	@Override
	public int exec(int a, int b) {
		return a + b;
	}

}
