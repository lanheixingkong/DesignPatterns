package org.shenlei.design.patterns.demo.command.group.extend;

public class Client {

	public static void main(String[] args) {
		//定义一个接头人
		Invoker invoker = new Invoker();
		//增加一项需求
		System.out.println("----------客户要求增加一项需求--------------");
		Command command = new AddRequirementCommand();
		invoker.setCommand(command);
		invoker.action();
		
		//删除一个页面
		Command deletePageCmd = new DeletePageCommand();
		invoker.setCommand(deletePageCmd);
		invoker.action();
	}
}
