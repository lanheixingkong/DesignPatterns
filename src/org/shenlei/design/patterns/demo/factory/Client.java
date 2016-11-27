package org.shenlei.design.patterns.demo.factory;

public class Client {

	public static void main(String[] args) {
		Creator creator = new ConcreteCreator();
		Product p = creator.createProduct(ConcreteProduct1.class);
		//TODO 业务处理
	}
}
