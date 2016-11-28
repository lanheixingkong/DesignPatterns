package org.shenlei.design.patterns.demo.strategy.extend;

public class Calculator {

	// 加符号
	private final static String ADD_SYMBOL = "+";
	// 减符号
	private final static String SUB_SYMBOL = "-";

	public int exec(int a, int b, String symbol) {
		int result = 0;
		if(ADD_SYMBOL.equals(symbol)){
			result = this.add(a, b);
		}else if(SUB_SYMBOL.equals(symbol)){
			result = this.sub(a, b);
		}
		return result;
	}

	private int sub(int a, int b) {
		return a - b;
	}

	private int add(int a, int b) {
		return a + b;
	}
}
