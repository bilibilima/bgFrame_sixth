package com.neuedu.model;

public class Stockout {
	
	private int stockoutno;
	private int storageno;
	private int goodsno;
	private int soquantity;
	private String sodate;
	private String handler;
	private String soremark;
	public Stockout() {
		super();
		// TODO 自动生成的构造函数存根
	}
	public Stockout(int stockoutno, int storageno, int goodsno, int soquantity, String sodate, String handler,
			String soremark) {
		super();
		this.stockoutno = stockoutno;
		this.storageno = storageno;
		this.goodsno = goodsno;
		this.soquantity = soquantity;
		this.sodate = sodate;
		this.handler = handler;
		this.soremark = soremark;
	}
	public int getStockoutno() {
		return stockoutno;
	}
	public void setStockoutno(int stockoutno) {
		this.stockoutno = stockoutno;
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
	public int getSoquantity() {
		return soquantity;
	}
	public void setSoquantity(int soquantity) {
		this.soquantity = soquantity;
	}

	public String getSodate() {
		return sodate;
	}
	public void setSodate(String sodate) {
		this.sodate = sodate;
	}
	public String getHandler() {
		return handler;
	}
	public void setHandler(String handler) {
		this.handler = handler;
	}
	public String getSoremark() {
		return soremark;
	}
	public void setSoremark(String soremark) {
		this.soremark = soremark;
	}
	
	
	
	
	
	

}
