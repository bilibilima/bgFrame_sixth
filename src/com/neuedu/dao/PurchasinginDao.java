package com.neuedu.dao;

import java.util.List;
import java.util.Map;

import com.neuedu.model.*;

public interface PurchasinginDao {

	public int countPurchasingin();
	
	public List<Purchasingin> findAll(Map<String, Object> map);
	
	public int addPurchasingin(Purchasingin u);
	
	public int updatePurchasingin(Purchasingin u);
	
	public int deletePurchasingin(int id);	
	
	
}
