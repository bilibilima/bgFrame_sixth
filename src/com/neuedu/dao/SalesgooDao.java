package com.neuedu.dao;

import java.util.List;
import java.util.Map;

import com.neuedu.model.*;

public interface SalesgooDao {

	public int countSalesgoo();
	
	public List<Salesgoo> findAll(Map<String, Object> map);
	
	public int addSalesgoo(Salesgoo u);
	
	public int updateSalesgoo(Salesgoo u);
	
	public int deleteSalesgoo(int id);	
	
	
	
}
