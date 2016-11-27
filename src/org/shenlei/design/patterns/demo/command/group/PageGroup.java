package org.shenlei.design.patterns.demo.command.group;

public class PageGroup extends Group{

	@Override
	public void find() {
		System.out.println("找到页面组");
	}

	@Override
	public void add() {
		System.out.println("增加页面");
	}

	@Override
	public void delete() {
		System.out.println("删除页面");
	}

	@Override
	public void change() {
		System.out.println("更改页面");		
	}

	@Override
	public void plan() {
		System.out.println("页面变更计划");		
	}

	@Override
	public void rollback() {
		System.out.println("回滚到上一个页面");
	}
}
