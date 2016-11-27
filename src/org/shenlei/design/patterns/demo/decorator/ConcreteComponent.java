package org.shenlei.design.patterns.demo.decorator;

public class ConcreteComponent implements Component {

	//具体实现
	@Override
	public void operator() {
		System.out.println("Do Something");
	}

}
