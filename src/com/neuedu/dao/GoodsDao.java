package com.neuedu.dao;

import java.util.List;
import java.util.Map;

import com.neuedu.model.*;

public interface GoodsDao {
	//统计
	public int countGoods();
	
	//查询
	public List<Goods> findAll(Map<String, Object> map);
	
	//添加
	public int addGoods(Goods u);
	
	//更新
	public int updateGoods(Goods u);
	
	//删除
	public int deleteGoods(int id);
}
