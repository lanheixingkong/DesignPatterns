package org.shenlei.design.patterns.demo.handler.chain.women;

public interface IHandler {

	//一个女性（女儿、妻子或母亲）要求逛街，你要处理这个请求
	public void HandlerMessage(IWomen women);
}
