package org.shenlei.design.patterns.demo.command.group;

public class CodeGroup extends Group{

	@Override
	public void find() {
		System.out.println("找到代码组");
	}

	@Override
	public void add() {
		System.out.println("增加功能");
	}

	@Override
	public void delete() {
		System.out.println("删除功能");
	}

	@Override
	public void change() {
		System.out.println("更改功能");		
	}

	@Override
	public void plan() {
		System.out.println("功能代码计划");		
	}

}
