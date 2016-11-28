package org.shenlei.design.patterns.demo.strategy.extend;

import java.util.Arrays;

public class StrategyClient {
	// 加符号
	private final static String ADD_SYMBOL = "+";
	// 减符号
	private final static String SUB_SYMBOL = "-";

	public static void main(String[] args) {
		// 输入两个参数是数字
		int a = Integer.parseInt(args[0]);
		String symbol = args[1];// 符号
		int b = Integer.parseInt(args[2]);
		System.out.println("输入的参数为：" + Arrays.toString(args));
		//上下文
		Context context = null;
		//判断初始化哪一个策略
		if(ADD_SYMBOL.equals(symbol)){
			context = new Context(new Add());
		}else if(SUB_SYMBOL.equals(symbol)){
			context = new Context(new Sub());
		}
		System.out.println("运行结果为：" + a + symbol + b + "=" + context.exec(a, b, symbol));
	}
}
