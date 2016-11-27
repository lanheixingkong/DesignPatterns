package org.shenlei.design.patterns.demo.command.extend;

public class Client {

	public static void main(String[] args) {
		//首先声明调用者Invoker
		Invoker invoker = new Invoker();
		//定义一个发送给接收者的命令
		Command command = new ConcreteCommand1();
		invoker.setCommand(command);
		invoker.action();
	}
}
