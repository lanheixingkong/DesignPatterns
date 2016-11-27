package org.shenlei.design.patterns.demo.factory;

public class ConcreteCreator extends Creator {

	@Override
	public <T extends Product> T createProduct(Class<T> c) {
		Product p = null;
		try {
			p = (T) Class.forName(c.getName()).newInstance();
		} catch (Exception e) {
			//异常处理
		}
		return (T) p;
	}

}
