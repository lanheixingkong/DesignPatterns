package org.shenlei.design.patterns.demo.absfactory;

/*
 * 有M个产品等级就应该有M个实现工厂类，在每个工厂中，实现不同产品族的生成任务。 
 *
 */
public class Creator1 extends AbstractCreator {

	@Override
	public AbstractProductA createProductA() {
		return new ProductA1();
	}

	@Override
	public AbstractProductB createProductB() {
		return new ProductB1();
	}

}
