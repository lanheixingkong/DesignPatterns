package org.shenlei.design.patterns.demo.mediator.right;

public abstract class AbstractColleague {

	protected AbstractMediator mediator;
	
	public AbstractColleague(AbstractMediator mediator) {
		this.mediator = mediator;
	}
}
