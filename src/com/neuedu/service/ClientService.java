package com.neuedu.service;

import java.util.List;
import java.util.Map;

import com.neuedu.model.Client;
import com.neuedu.model.GoodsType;

public interface ClientService {

	//查询
	public List<Client> getAll(Map<String,Object> map);
	
	//统计
	public int countClient();
	
	//添加
	public int addClient(Client u);
	
	//添加
	public int updateClient(Client u);
	
	//删除
	public int deleteClient(int id);	
	
}
