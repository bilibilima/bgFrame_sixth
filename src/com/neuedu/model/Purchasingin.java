package com.neuedu.model;

public class Purchasingin {

	private int pno;
	private int goodsno;
	private int quantityin;
	private float pricein;
	private String datein;
	private String handler;
	private String premark;
	private String storageno;
	
	public Purchasingin() {
		super();
		// TODO 自动生成的构造函数存根
	}
	
	public Purchasingin(int pno, int goodsno, int quantityin, float pricein, String datein, String handler,
			String premark, String storageno) {
		super();
		this.pno = pno;
		this.goodsno = goodsno;
		this.quantityin = quantityin;
		this.pricein = pricein;
		this.datein = datein;
		this.handler = handler;
		this.premark = premark;
		this.storageno = storageno;
	}

	public int getPno() {
		return pno;
	}

	public void setPno(int pno) {
		this.pno = pno;
	}

	public int getGoodsno() {
		return goodsno;
	}

	public void setGoodsno(int goodsno) {
		this.goodsno = goodsno;
	}

	public int getQuantityin() {
		return quantityin;
	}

	public void setQuantityin(int quantityin) {
		this.quantityin = quantityin;
	}

	public float getPricein() {
		return pricein;
	}

	public void setPricein(float pricein) {
		this.pricein = pricein;
	}

	public String getDatein() {
		return datein;
	}

	public void setDatein(String datein) {
		this.datein = datein;
	}

	public String getHandler() {
		return handler;
	}

	public void setHandler(String handler) {
		this.handler = handler;
	}

	public String getPremark() {
		return premark;
	}

	public void setPremark(String premark) {
		this.premark = premark;
	}

	public String getStorageno() {
		return storageno;
	}

	public void setStorageno(String storageno) {
		this.storageno = storageno;
	}
	
	
	
	
	
	
}
