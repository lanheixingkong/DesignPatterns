package org.shenlei.design.patterns.demo.handler.chain;


public abstract class Handler {

	// 责任传递，下一个责任人是谁
		private Handler nextHandler;

		// 一个女性（女儿、妻子或母亲）要求逛街，你要处理这个请求
		public final Response handlerMessage(Request request) {
			Response response = null;
			if (this.getHandlerLevel() == request.getRequestLevel()) {
				response = this.echo(request);
			} else {
				if (this.nextHandler != null) {
					// 若有后续环节，才把请求往后递送
					response = this.nextHandler.handlerMessage(request);
				} else {
					//TODO
				}
			}
			return response;
		}

		/*
		 * 如果不属于你处理的请求，你应该让她找下一个环节的人
		 */
		public void setNext(Handler nextHandler) {
			this.nextHandler = nextHandler;
		}
		
		//每一个处理者都有一个处理级别
		protected abstract Level getHandlerLevel();
		
		//每个处理者都必须实现处理任务
		protected abstract Response echo(Request request);
}
