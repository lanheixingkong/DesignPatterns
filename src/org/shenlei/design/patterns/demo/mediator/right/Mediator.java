package org.shenlei.design.patterns.demo.mediator.right;

public class Mediator extends AbstractMediator{

	@Override
	public void execute(String str, Object... objects) {
		if("purchase.buy".equals(str)){
			this.buyIBMComputer((Integer)objects[0]);
		}else if("sale.sell".equals(str)){
			this.sellComputer((Integer)objects[0]);
		}else if("sale.offsell".equals(str)){
			this.offSale();
		}else if("stock.clear".equals(str)){
			this.clearStock();
		}
	}

	private void clearStock() {
		//要求折价销售
		super.sale.offSale();
		//要求采购人员不要采购
		super.purchase.refuseBuyIBM();
	}

	private void offSale() {
		//库房有多少卖多少
		System.out.println("折价销售IBM电脑"+super.stock.getStockNumber()+"台");		
	}

	private void sellComputer(Integer num) {
		if (super.stock.getStockNumber() < num) {
			// 库存数量不够销售
			super.purchase.buyIBMComputer(num);
		}

		System.out.println("销售IBM电脑" + num + "台");
		super.stock.decrease(num);
	}

	private void buyIBMComputer(Integer num) {
		int saleStatus = super.sale.getSaleStatus();
		if (saleStatus > 80) {
			// 销售情况良好
			System.out.println("采购IBM电脑：" + num + "台");
			super.stock.increase(num);
		} else {
			// 销售情况不好
			int buyNumber = num / 2;// 折半采购
			System.out.println("采购IBM电脑：" + buyNumber + "台");
			super.stock.increase(buyNumber);
		}
	}

}
