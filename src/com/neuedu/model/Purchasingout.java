package com.neuedu.model;

public class Purchasingout {
	private int prno;
	private int goodsno;
	private int prquantity;
	private int prprice;
	private String prdate;
	private String handler;
	private String prremark;
	private String storageno;
	public Purchasingout() {
		super();
		// TODO 自动生成的构造函数存根
	}
	public Purchasingout(int prno, int goodsno, int prquantity, int prprice, String prdate, String handler,
			String prremark, String storageno) {
		super();
		this.prno = prno;
		this.goodsno = goodsno;
		this.prquantity = prquantity;
		this.prprice = prprice;
		this.prdate = prdate;
		this.handler = handler;
		this.prremark = prremark;
		this.storageno = storageno;
	}
	public int getPrno() {
		return prno;
	}
	public void setPrno(int prno) {
		this.prno = prno;
	}
	public int getGoodsno() {
		return goodsno;
	}
	public void setGoodsno(int goodsno) {
		this.goodsno = goodsno;
	}
	public int getPrquantity() {
		return prquantity;
	}
	public void setPrquantity(int prquantity) {
		this.prquantity = prquantity;
	}
	public int getPrprice() {
		return prprice;
	}
	public void setPrprice(int prprice) {
		this.prprice = prprice;
	}

	public String getPrdate() {
		return prdate;
	}
	public void setPrdate(String prdate) {
		this.prdate = prdate;
	}
	public String getHandler() {
		return handler;
	}
	public void setHandler(String handler) {
		this.handler = handler;
	}
	public String getPrremark() {
		return prremark;
	}
	public void setPrremark(String prremark) {
		this.prremark = prremark;
	}
	public String getStorageno() {
		return storageno;
	}
	public void setStorageno(String storageno) {
		this.storageno = storageno;
	}
	
	
	
	

}
