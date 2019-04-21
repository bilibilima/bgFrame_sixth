package com.neuedu.service;

import java.util.List;
import java.util.Map;

import com.neuedu.model.*;

public interface StockinService {

	//查询
	public List<Stockin> getAll(Map<String,Object> map);
	
	//统计
	public int countStockin();
	
	//添加
	public int addStockin(Stockin u);
	
	//添加
	public int updateStockin(Stockin u);
	
	//删除
	public int deleteStockin(int id);	
	
	
	
}
