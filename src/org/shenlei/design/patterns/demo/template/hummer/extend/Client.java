package org.shenlei.design.patterns.demo.template.hummer.extend;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Client {

	public static void main(String[] args) throws IOException {
		System.out.println("-----------H1型悍马------------");
		System.out.println("H1型悍马是否需要喇叭声音？0—不需要 1-需要");
		HummerH1Model h1 = new HummerH1Model();
		String type = (new BufferedReader(new InputStreamReader(System.in))).readLine();
		if("0".equals(type)){
			h1.setAlermFlag(false);
		}
		h1.run();
		System.out.println("-----------H2型悍马------------");
		HummerH2Model h2 = new HummerH2Model();
		h2.run();
	}
}
