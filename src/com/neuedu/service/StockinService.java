package com.neuedu.service;

import java.util.List;
import java.util.Map;

import com.neuedu.model.*;

public interface StockinService {

	//��ѯ
	public List<Stockin> getAll(Map<String,Object> map);
	
	//ͳ��
	public int countStockin();
	
	//���
	public int addStockin(Stockin u);
	
	//���
	public int updateStockin(Stockin u);
	
	//ɾ��
	public int deleteStockin(int id);	
	
	
	
}
