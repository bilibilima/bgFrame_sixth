package com.neuedu.dao;

import java.util.List;
import java.util.Map;

import com.neuedu.model.*;

public interface StockinDao {

	public int countStockin();
	
	public List<Stockin> findAll(Map<String, Object> map);
	
	public int addStockin(Stockin u);
	
	public int updateStockin(Stockin u);
	
	public int deleteStockin(int id);	
	
	
	
}
