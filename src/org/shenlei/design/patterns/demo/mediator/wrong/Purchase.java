package org.shenlei.design.patterns.demo.mediator.wrong;

//采购管理
public class Purchase {

	public void buyIBMComputer(int num) {
		// 访问库存
		Stock stock = new Stock();
		// 访问销售
		Sale sale = new Sale();

		int saleStatus = sale.getSaleStatus();
		if (saleStatus > 80) {
			// 销售情况良好
			System.out.println("采购IBM电脑：" + num + "台");
			stock.increase(num);
		} else {
			// 销售情况不好
			int buyNumber = num / 2;// 折半采购
			System.out.println("采购IBM电脑：" + buyNumber + "台");
			stock.increase(buyNumber);
		}
	}

	// 不再采购IBM电脑
	public void refuseBuyIBM() {
		System.out.println("不再采购IBM电脑");
	}
}
