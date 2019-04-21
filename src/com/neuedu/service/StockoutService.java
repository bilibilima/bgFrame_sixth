package com.neuedu.service;

import java.util.List;
import java.util.Map;

import com.neuedu.model.*;

public interface StockoutService {

	//查询
	public List<Stockout> getAll(Map<String,Object> map);
	
	//统计
	public int countStockout();
	
	//添加
	public int addStockout(Stockout u);
	
	//添加
	public int updateStockout(Stockout u);
	
	//删除
	public int deleteStockout(int id);	
	
	
	
}
