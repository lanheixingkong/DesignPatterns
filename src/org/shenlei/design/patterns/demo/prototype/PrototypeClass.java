package org.shenlei.design.patterns.demo.prototype;

public class PrototypeClass implements Cloneable{

	//覆写父类Object方法
	@Override
	protected PrototypeClass clone() {
		PrototypeClass prototypeClass = null;
		try {
			prototypeClass = (PrototypeClass) super.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return prototypeClass;
	}
}
