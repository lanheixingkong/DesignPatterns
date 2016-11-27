package org.shenlei.design.patterns.demo.proxy;

public class Proxy implements Subject {
	private Subject subject;

	public Proxy() {
		this.subject = new Proxy();
	}

	public Proxy(Object... objects) {
	}
	
	public Proxy(Subject subject){
		this.subject = subject;
	}

	@Override
	public void request() {
		this.before();
		this.subject.request();
		this.after();
	}

	private void before() {
		//TODO
	}
	
	private void after(){
		//TODO
	}

}
