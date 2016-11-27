package org.shenlei.design.patterns.demo.decorator.school;

public class SortDecorator extends Decorator {

	public SortDecorator(SchoolReport sr) {
		super(sr);
	}

	// 告诉老爸学校的排名情况
	private void reportSort() {
		System.out.println("我是排名第38名...");
	}

	//看完成绩单后汇报排名情况
	@Override
	public void report() {
		super.report();
		this.reportSort();
	}
}
