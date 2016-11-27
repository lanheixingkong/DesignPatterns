package org.shenlei.design.patterns.demo.builder.car;

import java.util.ArrayList;

public class Client {

	public static void main(String[] args) {
		BenzModel benz = new BenzModel();
		ArrayList<String> sequence = new ArrayList<String>();
		sequence.add("engine boom");
		sequence.add("start");
		sequence.add("stop");
		benz.setSequence(sequence);
		benz.run();
		
		BenzBuilder benzBuilder = new BenzBuilder();
		benzBuilder.setSequence(sequence);
		benz = (BenzModel)benzBuilder.getCarModel();
		benz.run();
		
		//按照同样的顺序再要一个宝马
		BMWBuilder bmwBuilder = new BMWBuilder();
		bmwBuilder.setSequence(sequence);
		BMWModel bmw = (BMWModel)bmwBuilder.getCarModel();
		bmw.run();
		
		Director director = new Director();
		director.getABenzModel().run();
		director.getBBenzModel().run();
		director.getCBMWModel().run();
	}
	
	
}
