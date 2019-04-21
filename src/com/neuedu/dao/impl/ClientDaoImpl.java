package com.neuedu.dao.impl;

import java.util.List;
import java.util.Map;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.neuedu.dao.ClientDao;
import com.neuedu.model.Client;


//spring����dao�ӿ�ʵ���࣬����spring���й���
@Repository
public class ClientDaoImpl implements ClientDao {

	 //����ע�룬����㼶������spring+mybatis
	@Autowired
	private SqlSessionTemplate sst;
	public void setSqlSessionTemplate(SqlSessionTemplate sst) {
		this.sst = sst;
	}
	
	
	@Override
	public int countClient() {
		// TODO �Զ����ɵķ������
		return sst.getMapper(ClientDao.class).countClient();
	}

	@Override
	public List<Client> findAll(Map<String, Object> map) {
		// TODO �Զ����ɵķ������
		return sst.getMapper(ClientDao.class).findAll(map);
	}

	@Override
	public int addClient(Client u) {
		// TODO �Զ����ɵķ������
		return sst.getMapper(ClientDao.class).addClient(u);
	}

	@Override
	public int updateClient(Client u) {
		// TODO �Զ����ɵķ������
		return sst.getMapper(ClientDao.class).updateClient(u);
	}

	@Override
	public int deleteClient(int id) {
		// TODO �Զ����ɵķ������
		return sst.getMapper(ClientDao.class).deleteClient(id);
	}

}
