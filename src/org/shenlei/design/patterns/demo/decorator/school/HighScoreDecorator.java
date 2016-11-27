package org.shenlei.design.patterns.demo.decorator.school;

public class HighScoreDecorator extends Decorator {

	public HighScoreDecorator(SchoolReport sr) {
		super(sr);
	}

	// 我要汇报最高成绩
	private void reportHighScore() {
		System.out.println("这次考试语文成绩最高是75，数学是78，自然是80");
	}

	//在看成绩单之前汇报最高成绩
	public void report() {
		this.reportHighScore();
		super.report();
	}

}
