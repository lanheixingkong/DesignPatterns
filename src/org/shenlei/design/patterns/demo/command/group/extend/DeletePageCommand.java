package org.shenlei.design.patterns.demo.command.group.extend;

public class DeletePageCommand extends Command{

	//删除一个页面的命令
	@Override
	public void execute() {
		//找到页面组
		super.pg.find();
		//删除一个页面
		super.pg.delete();
		//给出计划
		super.rg.plan();
	}

}
