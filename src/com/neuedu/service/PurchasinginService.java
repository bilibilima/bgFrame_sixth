package com.neuedu.service;

import java.util.List;
import java.util.Map;

import com.neuedu.model.*;

public interface PurchasinginService {

	public List<Purchasingin> getAll(Map<String,Object> map);
	
	public int countPurchasingin();
	
	public int addPurchasingin(Purchasingin u);
	
	public int updatePurchasingin(Purchasingin u);
	
	public int deletePurchasingin(int id);	
	
	
}
