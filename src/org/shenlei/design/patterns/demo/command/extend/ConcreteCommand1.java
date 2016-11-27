package org.shenlei.design.patterns.demo.command.extend;

import org.shenlei.design.patterns.demo.command.ConcreteReceiver1;
import org.shenlei.design.patterns.demo.command.Receiver;

public class ConcreteCommand1 extends Command{
	//声明自己默认的接收者
	public ConcreteCommand1() {
		super(new ConcreteReceiver1());
	}
	
	public ConcreteCommand1(Receiver receiver) {
		super(receiver);
	}

	@Override
	public void execute() {
		//业务处理
		super.receiver.doSomething();
	}

}
