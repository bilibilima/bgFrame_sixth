package com.neuedu.model;

public class Goods {

	private int goodsno;
	private String goodsname;
	//private int typeno;
	//private int providerno;
	
	private GoodsType goodsType;
	private Provider provider;
	
	
	private String specification;
	private String gremark;
	public Goods() {
		super();
		// TODO 自动生成的构造函数存根
	}
	public Goods(int goodsno, String goodsname, GoodsType goodsType, Provider provider, String specification,
			String gremark) {
		super();
		this.goodsno = goodsno;
		this.goodsname = goodsname;
		this.goodsType = goodsType;
		this.provider = provider;
		this.specification = specification;
		this.gremark = gremark;
	}
	public int getGoodsno() {
		return goodsno;
	}
	public void setGoodsno(int goodsno) {
		this.goodsno = goodsno;
	}
	public String getGoodsname() {
		return goodsname;
	}
	public void setGoodsname(String goodsname) {
		this.goodsname = goodsname;
	}

	public GoodsType getGoodsType() {
		return goodsType;
	}
	public void setGoodsType(GoodsType goodsType) {
		this.goodsType = goodsType;
	}
	public Provider getProvider() {
		return provider;
	}
	public void setProvider(Provider provider) {
		this.provider = provider;
	}
	public String getSpecification() {
		return specification;
	}
	public void setSpecification(String specification) {
		this.specification = specification;
	}
	public String getGremark() {
		return gremark;
	}
	public void setGremark(String gremark) {
		this.gremark = gremark;
	}

	
	
}
