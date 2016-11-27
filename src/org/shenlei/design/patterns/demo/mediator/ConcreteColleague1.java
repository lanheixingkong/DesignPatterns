package org.shenlei.design.patterns.demo.mediator;

public class ConcreteColleague1 extends Colleague{

	public ConcreteColleague1(Mediator mediator) {
		super(mediator);
	}

	public void selfMethod1() {
		//处理自己的业务逻辑
	}
	
	public void depMethod1(){
		//处理自己的业务逻辑
		//TODO
		//自己不能处理的业务逻辑，委托给中介者处理
		super.mediator.doSomething1();
	}

}
