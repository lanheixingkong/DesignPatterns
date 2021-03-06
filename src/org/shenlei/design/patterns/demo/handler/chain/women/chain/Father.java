package org.shenlei.design.patterns.demo.handler.chain.women.chain;

import org.shenlei.design.patterns.demo.handler.chain.women.IWomen;

public class Father extends Handler{

	public Father() {
		super(Handler.FATHER_LEVEL_REQUEST);
	}

	@Override
	protected void response(IWomen women) {
		System.out.println("---------女儿像父亲请示------------");
		System.out.println(women.getRequest());
		System.out.println("父亲的答复是：同意");
	}

}
