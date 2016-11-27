package org.shenlei.design.patterns.demo.command;

public abstract class Receiver {

	//抽象接收者，定义每个接收者都必须完成的业务（Group）
	public abstract void doSomething();
	
}
