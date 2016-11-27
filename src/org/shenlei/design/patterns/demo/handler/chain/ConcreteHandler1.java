package org.shenlei.design.patterns.demo.handler.chain;

public class ConcreteHandler1 extends Handler{
	
	
	//设置自己的处理级别
	@Override
	protected Level getHandlerLevel() {
		return null;
	}

	//定义自己的处理逻辑
	@Override
	protected Response echo(Request request) {
		// TODO Auto-generated method stub
		return null;
	}

}
