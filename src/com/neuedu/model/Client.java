package com.neuedu.model;

public class Client {
	
	private long clientno;
	private String client;
	private String caddress;
	private String cemail;
	private String cphone;
	
	public Client() {
		super();
		// TODO 自动生成的构造函数存根
	}

	public Client(long clientno, String client, String caddress, String cemail, String cphone) {
		super();
		this.clientno = clientno;
		this.client = client;
		this.caddress = caddress;
		this.cemail = cemail;
		this.cphone = cphone;
	}

	public long getClientno() {
		return clientno;
	}

	public void setClientno(long clientno) {
		this.clientno = clientno;
	}

	public String getClient() {
		return client;
	}

	public void setClient(String client) {
		this.client = client;
	}

	public String getCaddress() {
		return caddress;
	}

	public void setCaddress(String caddress) {
		this.caddress = caddress;
	}

	public String getCemail() {
		return cemail;
	}

	public void setCemail(String cemail) {
		this.cemail = cemail;
	}

	public String getCphone() {
		return cphone;
	}

	public void setCphone(String cphone) {
		this.cphone = cphone;
	}
	
	
	
	
}
