package com.neuedu.dao;

import java.util.List;
import java.util.Map;

import com.neuedu.model.*;

public interface GoodsDao {
	//ͳ��
	public int countGoods();
	
	//��ѯ
	public List<Goods> findAll(Map<String, Object> map);
	
	//���
	public int addGoods(Goods u);
	
	//����
	public int updateGoods(Goods u);
	
	//ɾ��
	public int deleteGoods(int id);
}
