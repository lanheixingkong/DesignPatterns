package org.shenlei.design.patterns.demo.command.group.extend;

public class CancelDeletePageCommand extends Command {

	@Override
	public void execute() {
		super.pg.rollback();
	}

}
