package org.shenlei.design.patterns.demo.strategy.sanguo;

public class ZhaoYun {

	public static void main(String[] args) {
		Context context;
		System.out.println("-------刚刚到吴国的时候拆第一个---------");
		context = new Context(new BackDoor());//拿到妙计
		context.operate();//拆开执行
		System.out.println("---------------------");
		//刘备乐不思蜀了，拆第二个了
		System.out.println("-------刘备乐不思蜀了，拆第二个了------");
		context = new Context(new GivenGreenLight());
		context.operate();
		System.out.println("---------------------");
		//孙权的小兵追来了，咋办？拆第三个
		System.out.println("---------孙权的小兵追来了，咋办？拆第三个--------");
		context = new Context(new BlockEnemy());
		context.operate();
	}
}
