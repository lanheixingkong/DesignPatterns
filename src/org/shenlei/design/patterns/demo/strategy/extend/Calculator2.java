package org.shenlei.design.patterns.demo.strategy.extend;

public class Calculator2 {

	// 加符号
	private final static String ADD_SYMBOL = "+";
	// 减符号
//	private final static String SUB_SYMBOL = "-";

	public int exec(int a, int b, String symbol) {
		return ADD_SYMBOL.equals(symbol) ? a + b : a - b;
	}

}
