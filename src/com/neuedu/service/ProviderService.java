package com.neuedu.service;

import java.util.List;
import java.util.Map;

import com.neuedu.model.*;

public interface ProviderService {

	//查询
	public List<Provider> getAll(Map<String,Object> map);
	
	//统计
	public int countProvider();
	
	//添加
	public int addProvider(Provider u);
	
	//添加
	public int updateProvider(Provider u);
	
	//删除
	public int deleteProvider(int id);	
	/**
	 * 查询所有数据，用于下拉框显示
	 * @return
	 */
	public List<Provider> findList();	

	
	
	
}
