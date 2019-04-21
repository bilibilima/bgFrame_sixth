package com.neuedu.model;

public class Provider {
	
	private long providerno;
	private String provider;
	private String paddress;
	private String plinkman;
	private String pemail;
	private String pphone;
	
	public Provider() {
		super();
		// TODO 自动生成的构造函数存根
	}
	
	public Provider(long providerno, String provider, String paddress, String plinkman, String pemail, String pphone) {
		super();
		this.providerno = providerno;
		this.provider = provider;
		this.paddress = paddress;
		this.plinkman = plinkman;
		this.pemail = pemail;
		this.pphone = pphone;
	}

	public long getProviderno() {
		return providerno;
	}

	public void setProviderno(long providerno) {
		this.providerno = providerno;
	}

	public String getProvider() {
		return provider;
	}

	public void setProvider(String provider) {
		this.provider = provider;
	}

	public String getPaddress() {
		return paddress;
	}

	public void setPaddress(String paddress) {
		this.paddress = paddress;
	}

	public String getPlinkman() {
		return plinkman;
	}

	public void setPlinkman(String plinkman) {
		this.plinkman = plinkman;
	}

	public String getPemail() {
		return pemail;
	}

	public void setPemail(String pemail) {
		this.pemail = pemail;
	}

	public String getPphone() {
		return pphone;
	}

	public void setPphone(String pphone) {
		this.pphone = pphone;
	}
	
	
	
	
	
	

}
