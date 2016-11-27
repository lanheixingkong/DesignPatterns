package org.shenlei.design.patterns.demo.handler.women;

import java.util.ArrayList;
import java.util.Random;

public class Client {

	public static void main(String[] args) {
		// 随机挑选几个女性
		Random r = new Random();
		ArrayList<IWomen> list = new ArrayList<IWomen>();
		for (int i = 0; i < 5; i++) {
			list.add(new Women(r.nextInt(4), "我要出去逛街"));
		}

		// 定义三个请示对象
		IHandler father = new Father();
		IHandler husband = new Husband();
		IHandler son = new Son();

		for (IWomen women : list) {
			if(women.getType() == 1){
				//未婚少女，请示父亲
				System.out.println("---------女儿向父亲请示--------");
				father.HandlerMessage(women);
			}else if(women.getType() == 2){
				//已婚妇女，请示丈夫
				System.out.println("---------妻子向丈夫请示--------");
				husband.HandlerMessage(women);
			}else if(women.getType() == 3){
				//母亲请示儿子
				System.out.println("---------母亲向儿子请示--------");
				son.HandlerMessage(women);
			}else{
			}
		}
	}
}
