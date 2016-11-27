package org.shenlei.design.patterns.demo.builder.car;

import java.util.ArrayList;

public abstract class CarModel {
	private ArrayList<String> sequence = new ArrayList<String>();

	protected abstract void start();

	protected abstract void stop();

	protected abstract void alarm();

	protected abstract void engineBoom();

	public void run() {
		for(String seq : sequence){
			switch (seq) {
			case "start":
				this.start();
				break;
			case "stop":
				this.stop();
				break;
			case "alarm":
				this.alarm();
				break;
			case "engine boom":
				this.engineBoom();
				break;
			default:
				break;
			}
		}
	}
	
	public void setSequence(ArrayList<String> sequence) {
		this.sequence = sequence;
	}
}
