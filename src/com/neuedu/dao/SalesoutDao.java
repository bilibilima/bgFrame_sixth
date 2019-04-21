package com.neuedu.dao;

import java.util.List;
import java.util.Map;

import com.neuedu.model.*;

public interface SalesoutDao {

	public int countSalesout();
	
	public List<Salesout> findAll(Map<String, Object> map);
	
	public int addSalesout(Salesout u);
	
	public int updateSalesout(Salesout u);
	
	public int deleteSalesout(int id);
	
	
}
