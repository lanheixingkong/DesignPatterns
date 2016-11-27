package org.shenlei.design.patterns.demo.singleton;

public class Singleton {
	//饿汉式单例
	private static final Singleton instance = new Singleton();

	private Singleton() {
	}

	private static Singleton getInstance() {
		return instance;
	}
}
