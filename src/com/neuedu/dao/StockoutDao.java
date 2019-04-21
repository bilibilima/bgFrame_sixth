package com.neuedu.dao;

import java.util.List;
import java.util.Map;

import com.neuedu.model.*;

public interface StockoutDao {

	public int countStockout();
	
	public List<Stockout> findAll(Map<String, Object> map);
	
	public int addStockout(Stockout u);
	
	public int updateStockout(Stockout u);
	
	public int deleteStockout(int id);	
	
	
}
