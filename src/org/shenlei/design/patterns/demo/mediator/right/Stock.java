package org.shenlei.design.patterns.demo.mediator.right;

//库存管理
public class Stock extends AbstractColleague{
	// 开始有100台电脑
	private static int COMPUTER_NUMBER = 100;

	public Stock(AbstractMediator abstractMediator) {
		super(abstractMediator);
	}

	// 库存增加
	public void increase(int num) {
		COMPUTER_NUMBER += num;
		System.out.println("库存数量为：" + COMPUTER_NUMBER);
	}

	// 库存降低
	public void decrease(int num) {
		COMPUTER_NUMBER -= num;
		System.out.println("库存数量为：" + COMPUTER_NUMBER);
	}

	// 获得库存数量
	public int getStockNumber() {
		return COMPUTER_NUMBER;
	}

	// 库存压力大了，通知采购人员不要采购，销售人员尽快销售
	public void clearStock() {
		System.out.println("清理存货数量为：" + COMPUTER_NUMBER);
		super.mediator.execute("stock.clear");
	}
}
