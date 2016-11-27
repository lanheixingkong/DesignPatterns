package org.shenlei.design.patterns.demo.mediator.wrong;

import java.util.Random;

//销售管理
public class Sale {

	// 销售IBM电脑
	public void sellIBMComputer(int num) {
		// 访问库存
		Stock stock = new Stock();
		// 访问采购
		Purchase purchase = new Purchase();
		if (stock.getStockNumber() < num) {
			// 库存数量不够销售
			purchase.buyIBMComputer(num);
		}

		System.out.println("销售IBM电脑" + num + "台");
		stock.decrease(num);

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
		//库房有多少卖多少
		Stock stock = new Stock();
		System.out.println("折价销售IBM电脑"+stock.getStockNumber()+"台");
	}

}
