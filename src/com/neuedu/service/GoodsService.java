package com.neuedu.service;

import java.util.List;
import java.util.Map;

import com.neuedu.model.*;

public interface GoodsService {

	//查询
	public List<Goods> getAll(Map<String,Object> map);
	
	//统计
	public int countGoods();
	
	//添加
	public int addGoods(Goods u);
	
	//添加
	public int updateGoods(Goods u);
	
	//删除
	public int deleteGoods(int id);	
	
	
}
