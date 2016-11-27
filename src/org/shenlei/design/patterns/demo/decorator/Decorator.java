package org.shenlei.design.patterns.demo.decorator;

/*
 * 装饰类通常是一个抽象类
 */
public abstract class Decorator implements Component{

	private Component component;

	// 通过构造函数传递被修饰者
	public Decorator(Component component) {
		this.component = component;
	}

	// 委托给被修饰者执行
	@Override
	public void operator() {
		this.component.operator();
	}
}
