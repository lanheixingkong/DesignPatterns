package org.shenlei.design.patterns.demo.handler.women;

public class Son implements IHandler{

	@Override
	public void HandlerMessage(IWomen women) {
		System.out.println("母亲的请示是：" + women.getRequest());
		System.out.println("父亲的答复是：同意");
	}

}
