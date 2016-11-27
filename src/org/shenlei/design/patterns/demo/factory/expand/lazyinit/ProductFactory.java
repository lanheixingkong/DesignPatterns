package org.shenlei.design.patterns.demo.factory.expand.lazyinit;

import java.util.HashMap;
import java.util.Map;

import org.shenlei.design.patterns.demo.factory.ConcreteProduct1;
import org.shenlei.design.patterns.demo.factory.ConcreteProduct2;
import org.shenlei.design.patterns.demo.factory.Product;

public class ProductFactory {

	private static final Map<String, Product> cache = new HashMap<String, Product>();

	public static synchronized Product createProduct(String type)
			throws Exception {
		Product prod = null;
		if (cache.containsKey(type)) {
			prod = cache.get(type);
		} else {
			if ("Product1".equals(type)) {
				prod = new ConcreteProduct1();
			} else {
				prod = new ConcreteProduct2();
			}
			cache.put(type, prod);
		}
		return prod;
	}
}
