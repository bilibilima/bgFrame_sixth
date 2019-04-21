package com.neuedu.dao;

import java.util.List;
import java.util.Map;

import com.neuedu.model.GoodsType;
import com.neuedu.model.Storage;

public interface GoodsTypeDao {

	public int countGoodsType();
	
	public List<GoodsType> findAll(Map<String, Object> map);
	
	public int addGoodsType(GoodsType u);
	
	public int updateGoodsType(GoodsType u);
	
	public int deleteGoodsType(int id);	
	
	
	/**
	 * 查询所有数据，用于下拉框显示
	 * @return
	 */
	public List<GoodsType> findList();
	
}
