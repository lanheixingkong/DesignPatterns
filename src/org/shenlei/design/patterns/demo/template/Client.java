package org.shenlei.design.patterns.demo.template;

public class Client {

	public static void main(String[] args) {
		AbstractClass cls1 = new ConcreteClass1();
		AbstractClass cls2 = new ConcreteClass2();
		
		cls1.templateMethod();
		cls2.templateMethod();
	}
}
