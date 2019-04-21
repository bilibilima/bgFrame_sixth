package com.neuedu.model;

public class Salesout {

	private int sno;
	private int goodsno;
	private int srquantity;
	private int srprice;
	private String srdate;
	private String handler;
	private int clientno;
	private String srremark;
	private int storageno;
	public Salesout() {
		super();
		// TODO 自动生成的构造函数存根
	}
	public Salesout(int sno, int goodsno, int srquantity, int srprice, String srdate, String handler, int clientno,
			String srremark, int storageno) {
		super();
		this.sno = sno;
		this.goodsno = goodsno;
		this.srquantity = srquantity;
		this.srprice = srprice;
		this.srdate = srdate;
		this.handler = handler;
		this.clientno = clientno;
		this.srremark = srremark;
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
	public int getSrquantity() {
		return srquantity;
	}
	public void setSrquantity(int srquantity) {
		this.srquantity = srquantity;
	}
	public int getSrprice() {
		return srprice;
	}
	public void setSrprice(int srprice) {
		this.srprice = srprice;
	}
	public String getSrdate() {
		return srdate;
	}
	public void setSrdate(String srdate) {
		this.srdate = srdate;
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
	public String getSrremark() {
		return srremark;
	}
	public void setSrremark(String srremark) {
		this.srremark = srremark;
	}
	public int getStorageno() {
		return storageno;
	}
	public void setStorageno(int storageno) {
		this.storageno = storageno;
	}
	
	
	
	
	
	
	
	
}
