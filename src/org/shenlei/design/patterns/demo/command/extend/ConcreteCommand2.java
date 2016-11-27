package org.shenlei.design.patterns.demo.command.extend;

import org.shenlei.design.patterns.demo.command.ConcreteReceiver2;
import org.shenlei.design.patterns.demo.command.Receiver;

public class ConcreteCommand2 extends Command{
	//声明自己默认的接收者
	public ConcreteCommand2() {
		super(new ConcreteReceiver2());
	}
	
	public ConcreteCommand2(Receiver receiver) {
		super(receiver);
	}

	@Override
	public void execute() {
		//业务处理
		super.receiver.doSomething();
	}

}
