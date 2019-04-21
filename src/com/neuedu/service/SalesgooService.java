package com.neuedu.service;

import java.util.List;
import java.util.Map;

import com.neuedu.model.*;

public interface SalesgooService {

	//查询
	public List<Salesgoo> getAll(Map<String,Object> map);
	
	//统计
	public int countSalesgoo();
	
	//添加
	public int addSalesgoo(Salesgoo u);
	
	//添加
	public int updateSalesgoo(Salesgoo u);
	
	//删除
	public int deleteSalesgoo(int id);	
	
	
	
}
