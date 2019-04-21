package com.neuedu.model;

public class Salesgoo {
	private int sno;
	private int goodsno;
	private int quantitysale;
	private int pricesale;
	private String datesale;
	private String handler;
	private int clientno;
	private String sremark;
	private int storageno;
	public Salesgoo() {
		super();
		// TODO 自动生成的构造函数存根
	}
	public Salesgoo(int sno, int goodsno, int quantitysale, int pricesale, String datesale, String handler,
			int clientno, String sremark, int storageno) {
		super();
		this.sno = sno;
		this.goodsno = goodsno;
		this.quantitysale = quantitysale;
		this.pricesale = pricesale;
		this.datesale = datesale;
		this.handler = handler;
		this.clientno = clientno;
		this.sremark = sremark;
		this.storageno = storageno;
	}
	public int getSno() {
		return sno;
	}
	public void setSno(int sno) {
		this.sno = sno;
	}
	public int getGoodsno() {
		return goodsno;
	}
	public void setGoodsno(int goodsno) {
		this.goodsno = goodsno;
	}
	public int getQuantitysale() {
		return quantitysale;
	}
	public void setQuantitysale(int quantitysale) {
		this.quantitysale = quantitysale;
	}
	public int getPricesale() {
		return pricesale;
	}
	public void setPricesale(int pricesale) {
		this.pricesale = pricesale;
	}
	public String getDatesale() {
		return datesale;
	}
	public void setDatesale(String datesale) {
		this.datesale = datesale;
	}
	public String getHandler() {
		return handler;
	}
	public void setHandler(String handler) {
		this.handler = handler;
	}
	public int getClientno() {
		return clientno;
	}
	public void setClientno(int clientno) {
		this.clientno = clientno;
	}
	public String getSremark() {
		return sremark;
	}
	public void setSremark(String sremark) {
		this.sremark = sremark;
	}
	public int getStorageno() {
		return storageno;
	}
	public void setStorageno(int storageno) {
		this.storageno = storageno;
	}
	
	
	
	
	
	
	
}
