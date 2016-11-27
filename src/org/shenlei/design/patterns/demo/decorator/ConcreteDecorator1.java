package org.shenlei.design.patterns.demo.decorator;

public class ConcreteDecorator1 extends Decorator {

	public ConcreteDecorator1(Component component) {
		super(component);
	}

	// 定义自己的修饰方法
	private void method1() {
		System.out.println("method1 修饰");
	}

	// 重写父类的Operation方法
	public void operator() {
		this.method1();
		super.operator();
	}

}
