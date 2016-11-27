package org.shenlei.design.patterns.demo.command.group.extend;

import org.shenlei.design.patterns.demo.command.group.CodeGroup;
import org.shenlei.design.patterns.demo.command.group.PageGroup;
import org.shenlei.design.patterns.demo.command.group.RequirementGroup;

public abstract class Command {

	//把三个组都定义好，子类可以直接使用
	protected RequirementGroup rg = new RequirementGroup();
	protected PageGroup pg = new PageGroup();
	protected CodeGroup cg = new CodeGroup();
	
	public abstract void execute();
	
}
