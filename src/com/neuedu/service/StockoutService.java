package com.neuedu.service;

import java.util.List;
import java.util.Map;

import com.neuedu.model.*;

public interface StockoutService {

	//��ѯ
	public List<Stockout> getAll(Map<String,Object> map);
	
	//ͳ��
	public int countStockout();
	
	//���
	public int addStockout(Stockout u);
	
	//���
	public int updateStockout(Stockout u);
	
	//ɾ��
	public int deleteStockout(int id);	
	
	
	
}
