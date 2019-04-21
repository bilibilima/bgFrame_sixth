package com.neuedu.dao;

import java.util.List;
import java.util.Map;

import com.neuedu.model.Storage;

public interface StorageDao {
	
	public int countStorage();
	
	public List<Storage> findAll(Map<String, Object> map);
	
	public int addStorage(Storage u);
	
	public int updateStorage(Storage u);
	
	public int deleteStorage(int id);	
	
}
