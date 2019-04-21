package com.neuedu.service;

import java.util.List;
import java.util.Map;

import com.neuedu.model.Storage;


public interface StorageService {
	
	public List<Storage> getAll(Map<String,Object> map);
	
	public int countStorage();
	
	public int addStorage(Storage u);
	
	public int updateStorage(Storage u);
	
	public int deleteStorage(int id);	
	
	
	
}
