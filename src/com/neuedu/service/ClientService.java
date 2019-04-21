package com.neuedu.service;

import java.util.List;
import java.util.Map;

import com.neuedu.model.Client;
import com.neuedu.model.GoodsType;

public interface ClientService {

	//��ѯ
	public List<Client> getAll(Map<String,Object> map);
	
	//ͳ��
	public int countClient();
	
	//���
	public int addClient(Client u);
	
	//���
	public int updateClient(Client u);
	
	//ɾ��
	public int deleteClient(int id);	
	
}
