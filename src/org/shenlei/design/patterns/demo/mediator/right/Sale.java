package org.shenlei.design.patterns.demo.mediator.right;

import java.util.Random;

//销售管理
public class Sale extends AbstractColleague{

	public Sale(AbstractMediator abstractMediator) {
		super(abstractMediator);
	}

	// 销售IBM电脑
	public void sellIBMComputer(int num) {
		super.mediator.execute("sale.sell", num);
		System.out.println("销售IBM电脑" + num + "台");
	}

	// 反馈销售情况，0~100之间变化，0代表根本就没人要，100代表非常畅销，出一个卖一个
	public int getSaleStatus() {
		Random r = new Random();
		int saleStatus = r.nextInt(100);
		System.out.println("IBM电脑的销售情况为：" + saleStatus);
		return saleStatus;
	}

	//折价处理
	public void offSale() {
		super.mediator.execute("sale.offsell");
	}

}
