package org.shenlei.design.patterns.demo.factory.nvwa;

public class HumanFactory extends AbstractHumanFactory {

	@Override
	public <T extends Human> T createHuman(Class<T> c) {
		Human human = null;
		try{
			human = (T)Class.forName(c.getName()).newInstance();
		}catch(Exception e){
			System.out.println("人类生成错误");
		}
		return (T)human;
	}

}
