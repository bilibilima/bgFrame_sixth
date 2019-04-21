package com.neuedu.service;

import java.util.List;
import java.util.Map;

import com.neuedu.model.GoodsType;
import com.neuedu.model.Storage;

public interface GoodsTypeService {
	
	public List<GoodsType> getAll(Map<String,Object> map);
	
	public int countGoodsType();
	
	public int addGoodsType(GoodsType u);
	
	public int updateGoodsType(GoodsType u);
	
	public int deleteGoodsType(int id);
	
	/**
	 * ��ѯ�������ݣ�������������ʾ
	 * @return
	 */
	public List<GoodsType> findList();

	
	
}
