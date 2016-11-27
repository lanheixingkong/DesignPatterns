package org.shenlei.design.patterns.demo.decorator.school;

public class Father {

	public static void main(String[] args) {
		//把成绩单拿过来
		SchoolReport sr = new FouthGradeSchoolReport();
		//看成绩单
		sr.report();
		//签名？休想！
		
		//美化后的成绩单
		SchoolReport ssr = new SugarFouthGradeSchoolReport();
		//看成绩单
		ssr.report();
		//然后老爸，一看，很开心，就签名了
		ssr.sign("老王");
		
		//利用装饰工具美化后
		SchoolReport dsr = null;
		//原装成绩单
		dsr = new FouthGradeSchoolReport();
		//加了最高分说明的成绩单
		dsr = new HighScoreDecorator(dsr);
		//又加了成绩排名的成绩单
		dsr = new SortDecorator(dsr);
		dsr.report();
		dsr.sign("老王");
	}
}
