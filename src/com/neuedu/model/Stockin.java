package com.neuedu.model;

public class Stockin {
	
	private int stockinno;
	private int storageno;
	private int goodsno;
	private int siquantity;
	private String sidate;
	private String handler;
	private String siremark;
	public Stockin() {
		super();
		// TODO 自动生成的构造函数存根
	}
	public Stockin(int stockinno, int storageno, int goodsno, int siquantity, String sidate, String handler,
			String siremark) {
		super();
		this.stockinno = stockinno;
		this.storageno = storageno;
		this.goodsno = goodsno;
		this.siquantity = siquantity;
		this.sidate = sidate;
		this.handler = handler;
		this.siremark = siremark;
	}
	public int getStockinno() {
		return stockinno;
	}
	public void setStockinno(int stockinno) {
		this.stockinno = stockinno;
	}
	public int getStorageno() {
		return storageno;
	}
	public void setStorageno(int storageno) {
		this.storageno = storageno;
	}
	public int getGoodsno() {
		return goodsno;
	}
	public void setGoodsno(int goodsno) {
		this.goodsno = goodsno;
	}
	public int getSiquantity() {
		return siquantity;
	}
	public void setSiquantity(int siquantity) {
		this.siquantity = siquantity;
	}
	public String getSidate() {
		return sidate;
	}
	public void setSidate(String sidate) {
		this.sidate = sidate;
	}
	public String getHandler() {
		return handler;
	}
	public void setHandler(String handler) {
		this.handler = handler;
	}
	public String getSiremark() {
		return siremark;
	}
	public void setSiremark(String siremark) {
		this.siremark = siremark;
	}
	
	
	
	
	
	
	

}
