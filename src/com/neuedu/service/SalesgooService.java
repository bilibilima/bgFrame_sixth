package com.neuedu.service;

import java.util.List;
import java.util.Map;

import com.neuedu.model.*;

public interface SalesgooService {

	//��ѯ
	public List<Salesgoo> getAll(Map<String,Object> map);
	
	//ͳ��
	public int countSalesgoo();
	
	//���
	public int addSalesgoo(Salesgoo u);
	
	//���
	public int updateSalesgoo(Salesgoo u);
	
	//ɾ��
	public int deleteSalesgoo(int id);	
	
	
	
}
