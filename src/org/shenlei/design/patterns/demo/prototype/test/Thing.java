package org.shenlei.design.patterns.demo.prototype.test;

import java.util.ArrayList;
import java.util.List;

public class Thing implements Cloneable {
	private ArrayList<String> list = new ArrayList<String>();

	public Thing() {
		System.out.println("构造函数被执行了");
	}

	@Override
	protected Thing clone() {
		Thing thing = null;
		try {
			thing = (Thing) super.clone();
			//深拷贝
			thing.list = (ArrayList<String>) this.list.clone();
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
