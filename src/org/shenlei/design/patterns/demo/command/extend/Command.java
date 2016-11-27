package org.shenlei.design.patterns.demo.command.extend;

import org.shenlei.design.patterns.demo.command.Receiver;

//将Receiver封装在命令中，减少Client对Receiver的依赖
public abstract class Command {
	//定义一个子类的全局共享变量
	protected final Receiver receiver;
	
	//实现类必须定义一个接收者
	public Command(Receiver receiver) {
		this.receiver = receiver;
	}

	//每个命令类都必须有一个执行命令的方法
	public abstract void execute();
}
