package org.shenlei.design.patterns.demo.singleton;

public class LazySingleton {
	//懒汉式单例
	private static LazySingleton instance = null;

	private LazySingleton() {
	}

	public static LazySingleton getInstance() {
		if (instance == null) {
			synchronized (LazySingleton.class) {
				if (instance == null) {
					instance = new LazySingleton();
				}
			}
		}
		return instance;
	}
}
