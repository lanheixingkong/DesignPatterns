package org.shenlei.design.patterns.demo.strategy.extend;

public enum CalculatorEnum {

	//加法运算
	ADD("+"){
		public int exec(int a, int b){
			return a + b;
		}
	},
	SUB("-"){
		public int exec(int a, int b){
			return a - b;
		}
	};
	
	String value = "";
	
	private CalculatorEnum(String value) {
		this.value = value;
	}
	
	public String getValue() {
		return value;
	}
	
	//声明一个抽象函数
	public abstract int exec(int a, int b);
}
