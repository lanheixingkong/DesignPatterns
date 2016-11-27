package org.shenlei.design.patterns.demo.mediator.right;

//采购管理
public class Purchase extends AbstractColleague{

	public Purchase(AbstractMediator abstractMediator) {
		super(abstractMediator);
	}

	public void buyIBMComputer(int num) {
		super.mediator.execute("purchase.buy", num);
	}

	// 不再采购IBM电脑
	public void refuseBuyIBM() {
		System.out.println("不再采购IBM电脑");
	}
}
