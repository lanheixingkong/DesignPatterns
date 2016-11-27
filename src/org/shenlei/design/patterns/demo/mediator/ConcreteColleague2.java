package org.shenlei.design.patterns.demo.mediator;

public class ConcreteColleague2 extends Colleague{

	public ConcreteColleague2(Mediator mediator) {
		super(mediator);
	}

	public void selfMethod2() {
		//处理自己的业务逻辑
	}
	
	public void depMethod2(){
		//处理自己的业务逻辑
		//TODO
		//自己不能处理的业务逻辑，委托给中介者处理
		super.mediator.doSomething2();
	}

}
