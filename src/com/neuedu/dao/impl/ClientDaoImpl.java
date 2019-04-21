package com.neuedu.dao.impl;

import java.util.List;
import java.util.Map;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.neuedu.dao.ClientDao;
import com.neuedu.model.Client;


//spring，把dao接口实现类，交给spring进行管理
@Repository
public class ClientDaoImpl implements ClientDao {

	 //依赖注入，代码层级的整合spring+mybatis
	@Autowired
	private SqlSessionTemplate sst;
	public void setSqlSessionTemplate(SqlSessionTemplate sst) {
		this.sst = sst;
	}
	
	
	@Override
	public int countClient() {
		// TODO 自动生成的方法存根
		return sst.getMapper(ClientDao.class).countClient();
	}

	@Override
	public List<Client> findAll(Map<String, Object> map) {
		// TODO 自动生成的方法存根
		return sst.getMapper(ClientDao.class).findAll(map);
	}

	@Override
	public int addClient(Client u) {
		// TODO 自动生成的方法存根
		return sst.getMapper(ClientDao.class).addClient(u);
	}

	@Override
	public int updateClient(Client u) {
		// TODO 自动生成的方法存根
		return sst.getMapper(ClientDao.class).updateClient(u);
	}

	@Override
	public int deleteClient(int id) {
		// TODO 自动生成的方法存根
		return sst.getMapper(ClientDao.class).deleteClient(id);
	}

}
