package org.shenlei.design.patterns.demo.prototype.test;

import java.util.ArrayList;
import java.util.List;

public class FinalThing implements Cloneable {
	private final ArrayList<String> list = new ArrayList<String>();

	public FinalThing() {
		System.out.println("构造函数被执行了");
	}

	@Override
	protected FinalThing clone() {
		FinalThing thing = null;
		try {
			thing = (FinalThing) super.clone();
			//深拷贝，编译错误
//			thing.list = (ArrayList<String>) this.list.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return thing;
	}

	public void setValue(String value) {
		this.list.add(value);
	}

	public List<String> getValue() {
		return this.list;
	}
}
