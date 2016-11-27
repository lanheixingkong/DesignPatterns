package org.shenlei.design.patterns.demo.handler.women.handler;

import org.shenlei.design.patterns.demo.handler.women.IWomen;

public class Son extends Handler{

	public Son() {
		super(Handler.SON_LEVEL_REQUEST);
	}

	@Override
	protected void response(IWomen women) {
		System.out.println("---------母亲像儿子请示------------");
		System.out.println(women.getRequest());
		System.out.println("儿子的答复是：同意");
	}

}
