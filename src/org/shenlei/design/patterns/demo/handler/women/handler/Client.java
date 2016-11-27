package org.shenlei.design.patterns.demo.handler.women.handler;

import java.util.ArrayList;
import java.util.Random;

import org.shenlei.design.patterns.demo.handler.women.IWomen;
import org.shenlei.design.patterns.demo.handler.women.Women;

public class Client {

	public static void main(String[] args) {
		// 随机挑选几个女性
				Random r = new Random();
				ArrayList<IWomen> list = new ArrayList<IWomen>();
				for (int i = 0; i < 5; i++) {
					list.add(new Women(r.nextInt(4), "我要出去逛街"));
				}

				// 定义三个请示对象
				Handler father = new Father();
				Handler husband = new Husband();
				Handler son = new Son();
				//设置请示顺序
				father.setNext(husband);
				husband.setNext(son);

				for (IWomen women : list) {
					father.handlerMessage(women);
				}
	}
}
