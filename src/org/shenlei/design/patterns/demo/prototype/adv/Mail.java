package org.shenlei.design.patterns.demo.prototype.adv;

public class Mail implements Cloneable{

	private String receiver;
	
	private String subject;
	
	//称谓
	private String appellation;
	
	private String content;
	
	private String tail;
	
	public Mail(AdvTemplate advTemplate) {
		this.content = advTemplate.getAdvContent();
		this.subject = advTemplate.getAdvSubject();
	}

	public String getReceiver() {
		return receiver;
	}

	public void setReceiver(String receiver) {
		this.receiver = receiver;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getAppellation() {
		return appellation;
	}

	public void setAppellation(String appellation) {
		this.appellation = appellation;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getTail() {
		return tail;
	}

	public void setTail(String tail) {
		this.tail = tail;
	}
	
	@Override
	protected Mail clone() {
		Mail mail = null;
		try {
			mail = (Mail)super.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return mail;
	}
}
