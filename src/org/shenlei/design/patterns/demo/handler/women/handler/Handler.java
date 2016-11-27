package org.shenlei.design.patterns.demo.handler.women.handler;

import org.shenlei.design.patterns.demo.handler.women.IWomen;

public abstract class Handler {

	public final static int FATHER_LEVEL_REQUEST = 1;
	public final static int HUSBAND_LEVEL_REQUEST = 2;
	public final static int SON_LEVEL_REQUEST = 3;

	// 能处理的的级别
	private int level = 0;
	// 责任传递，下一个责任人是谁
	private Handler nextHandler;

	// 每个类都要说明一下自己能处理哪些请示
	public Handler(int level) {
		this.level = level;
	}

	// 一个女性（女儿、妻子或母亲）要求逛街，你要处理这个请求
	public final void handlerMessage(IWomen women) {
		if (women.getType() == this.level) {
			this.response(women);
		} else {
			if (this.nextHandler != null) {
				// 若有后续环节，才把请求往后递送
				this.nextHandler.handlerMessage(women);
			} else {
				// 已经没有后续处理人了，不用再处理
				System.out.println("------没地方请示了，按不同意处理----\n");
			}
		}
	}

	/*
	 * 如果不属于你处理的请求，你应该让她找下一个环节的人
	 */
	public void setNext(Handler nextHandler) {
		this.nextHandler = nextHandler;
	}
	
	//有请示那当然要回应
	protected abstract void response(IWomen women);
}
