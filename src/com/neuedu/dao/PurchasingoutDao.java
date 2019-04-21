package com.neuedu.dao;

import java.util.List;
import java.util.Map;

import com.neuedu.model.*;

public interface PurchasingoutDao {

	
	public int countPurchasingout();
	
	public List<Purchasingout> findAll(Map<String, Object> map);
	
	public int addPurchasingout(Purchasingout u);
	
	public int updatePurchasingout(Purchasingout u);
	
	public int deletePurchasingout(int id);	
}
