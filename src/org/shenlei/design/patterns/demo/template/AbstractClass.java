package org.shenlei.design.patterns.demo.template;

public abstract class AbstractClass {

	//基本方法
	protected abstract void doSomething();

	//基本方法
	protected abstract void doSomeAnything();
	
	//模板方法
	public void templateMethod(){
		this.doSomeAnything();
		this.doSomething();
	}
}
