package org.shenlei.design.patterns.demo.prototype.adv;

import java.util.Random;

public class Client {
	// 发送账单的数量，从数据库中获得
	private static int MAX_COUNT = 6;

	public static void main(String[] args) {
		// 模拟发送邮件
		int i = 0;
		// 把模板定义出来，从数据库中获得
		Mail mail = new Mail(new AdvTemplate());
		mail.setTail("XX银行版权所有");
		while (i < MAX_COUNT) {
			// 以下是没封邮件不同的地方
			mail.setAppellation(getRandString(5) + "先生（女士）");
			mail.setReceiver(getRandString(5) + "@" + getRandString(8) + ".com");
			// 发送邮件
			sendMail(mail);
			i++;
		}
		
		Mail mail2 = new Mail(new AdvTemplate());
		mail2.setTail("XX银行版权所有");
		while (i < MAX_COUNT) {
			// 以下是没封邮件不同的地方
			Mail cloneMail = mail2.clone();
			cloneMail.setAppellation(getRandString(5) + "先生（女士）");
			cloneMail.setReceiver(getRandString(5) + "@" + getRandString(8) + ".com");
			// 发送邮件
			sendMail(cloneMail);
			i++;
		}

	}

	private static void sendMail(Mail mail) {
		System.out.println("标题：" + mail.getSubject() + "\t收件人："
				+ mail.getReceiver() + "\t...发送成功");
	}

	private static String getRandString(int maxLength) {
		String source = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
		StringBuffer sb = new StringBuffer(maxLength);
		Random r = new Random();
		for(int i=0;i<maxLength;i++){
			sb.append(source.charAt(r.nextInt(source.length())));
		}
		return sb.toString();
	}
}
