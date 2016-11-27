package org.shenlei.design.patterns.demo.prototype.test;

public class Client {

	public static void main(String[] args) {
		//产生一个对象
		Thing thing = new Thing();
		//拷贝一个对象,构造函数不会被执行
		Thing thing2 = thing.clone();
		
		//浅拷贝测试
		thing.setValue("张三");
		Thing cloneThing = thing.clone();
		cloneThing.setValue("李四");
		System.out.println(thing.getValue());
	}
}
