package com.neuedu.dao;

import java.util.List;
import java.util.Map;

import com.neuedu.model.*;

public interface ProviderDao {

	//统计
	public int countProvider();
	
	//查询
	public List<Provider> findAll(Map<String, Object> map);
	
	//添加
	public int addProvider(Provider u);
	
	//更新
	public int updateProvider(Provider u);
	
	//删除
	public int deleteProvider(int id);
	
	
	/**
	 * 查询所有数据，用于下拉框显示
	 * @return
	 */
	public List<Provider> findList();

	
}
