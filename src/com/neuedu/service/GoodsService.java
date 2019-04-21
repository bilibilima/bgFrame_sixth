package com.neuedu.service;

import java.util.List;
import java.util.Map;

import com.neuedu.model.*;

public interface GoodsService {

	//��ѯ
	public List<Goods> getAll(Map<String,Object> map);
	
	//ͳ��
	public int countGoods();
	
	//���
	public int addGoods(Goods u);
	
	//���
	public int updateGoods(Goods u);
	
	//ɾ��
	public int deleteGoods(int id);	
	
	
}
