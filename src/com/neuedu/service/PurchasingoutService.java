package com.neuedu.service;

import java.util.List;
import java.util.Map;

import com.neuedu.model.*;

public interface PurchasingoutService {

	public List<Purchasingout> getAll(Map<String,Object> map);
	
	public int countPurchasingout();
	
	public int addPurchasingout(Purchasingout u);
	
	public int updatePurchasingout(Purchasingout u);
	
	public int deletePurchasingout(int id);	
	
}
