package org.shenlei.design.patterns.demo.singleton.expand.mult;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Emperor {

	// 定义最多能产生的实例数量
	private static int maxNumOfEmperor = 2;

	// 每个皇帝都有名字，使用一个ArrayList来容纳，每个对象的私有属性
	private static List<String> nameList = new ArrayList<String>();

	// 定义一个列表，容纳所有的皇帝实例
	private static List<Emperor> emperorList = new ArrayList<Emperor>();

	// 当前皇帝的序列号
	private static int countNumOfEmperor = 0;

	// 产生所有的对象
	static {
		for (int i = 0; i < maxNumOfEmperor; i++) {
			emperorList.add(new Emperor("皇"+(i+1)+"帝"));
		}
	}

	private Emperor(String name) {
		nameList.add(name);
	}

	private Emperor() {
	}

	// 随机获取一个皇帝对象
	public static Emperor getInstance() {
		Random r = new Random();
		countNumOfEmperor = r.nextInt(maxNumOfEmperor);
		return emperorList.get(countNumOfEmperor);
	}

	public static void say() {
		System.out.println(nameList.get(countNumOfEmperor));
	}
}
