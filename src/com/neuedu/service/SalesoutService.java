package com.neuedu.service;

import java.util.List;
import java.util.Map;

import com.neuedu.model.*;

public interface SalesoutService {

	//查询
	public List<Salesout> getAll(Map<String,Object> map);
	
	//统计
	public int countSalesout();
	
	//添加
	public int addSalesout(Salesout u);
	
	//添加
	public int updateSalesout(Salesout u);
	
	//删除
	public int deleteSalesout(int id);
	
}
