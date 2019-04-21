package com.neuedu.dao;

import java.util.List;
import java.util.Map;

import com.neuedu.model.Client;
import com.neuedu.model.GoodsType;

public interface ClientDao {

	//统计
	public int countClient();
	
	//查询
	public List<Client> findAll(Map<String, Object> map);
	
	//添加
	public int addClient(Client u);
	
	//更新
	public int updateClient(Client u);
	
	//删除
	public int deleteClient(int id);	
	
}
