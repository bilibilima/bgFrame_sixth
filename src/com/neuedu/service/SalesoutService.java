package com.neuedu.service;

import java.util.List;
import java.util.Map;

import com.neuedu.model.*;

public interface SalesoutService {

	//��ѯ
	public List<Salesout> getAll(Map<String,Object> map);
	
	//ͳ��
	public int countSalesout();
	
	//���
	public int addSalesout(Salesout u);
	
	//���
	public int updateSalesout(Salesout u);
	
	//ɾ��
	public int deleteSalesout(int id);
	
}
