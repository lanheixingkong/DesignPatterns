package org.shenlei.design.patterns.demo.absfactory;

public class Client {

	public static void main(String[] args) {
		// 定义出两个工厂
		AbstractCreator creator1 = new Creator1();
		AbstractCreator creator2 = new Creator2();

		// 产生A1对象
		AbstractProductA a1 = creator1.createProductA();
		// 产生A2对象
		AbstractProductA a2 = creator2.createProductA();
		// 产生B1对象
		AbstractProductB b1 = creator1.createProductB();
		// 产生A2对象
		AbstractProductB b2 = creator2.createProductB();
		//TODO 业务逻辑
	}
}
