package org.shenlei.design.patterns.demo.builder.car;

import java.util.ArrayList;

public class Director {

	private ArrayList<String> sequence = new ArrayList<String>();

	private BenzBuilder benzBuilder = new BenzBuilder();

	private BMWBuilder bmwBuilder = new BMWBuilder();

	public BenzModel getABenzModel() {
		this.sequence.clear();
		this.sequence.add("start");
		this.sequence.add("stop");
		this.benzBuilder.setSequence(sequence);
		return (BenzModel)this.benzBuilder.getCarModel();
	}
	
	public BenzModel getBBenzModel() {
		this.sequence.clear();
		this.sequence.add("engine boom");
		this.sequence.add("start");
		this.sequence.add("stop");
		this.benzBuilder.setSequence(sequence);
		return (BenzModel)this.benzBuilder.getCarModel();
	}
	
	public BMWModel getCBMWModel() {
		this.sequence.clear();
		this.sequence.add("alarm");
		this.sequence.add("start");
		this.sequence.add("stop");
		this.bmwBuilder.setSequence(sequence);
		return (BMWModel)this.bmwBuilder.getCarModel();
	}
	
	public BMWModel getDBMWModel() {
		this.sequence.clear();
		this.sequence.add("start");
		this.bmwBuilder.setSequence(sequence);
		return (BMWModel)this.bmwBuilder.getCarModel();
	}
	
	/**
	 * 还可以按照其他顺序生产其他类型的车
	 */
}
