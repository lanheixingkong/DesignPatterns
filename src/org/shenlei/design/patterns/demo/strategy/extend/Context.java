package org.shenlei.design.patterns.demo.strategy.extend;

public class Context {

	private CalculatorStrategy strategy;

	public Context(CalculatorStrategy strategy) {
		this.strategy = strategy;
	}

	public int exec(int a, int b, String symbol) {
		return this.strategy.exec(a, b);
	}
}
