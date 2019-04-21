package com.neuedu.dao;

import java.util.List;
import java.util.Map;

import com.neuedu.model.Client;
import com.neuedu.model.GoodsType;

public interface ClientDao {

	//ͳ��
	public int countClient();
	
	//��ѯ
	public List<Client> findAll(Map<String, Object> map);
	
	//���
	public int addClient(Client u);
	
	//����
	public int updateClient(Client u);
	
	//ɾ��
	public int deleteClient(int id);	
	
}
