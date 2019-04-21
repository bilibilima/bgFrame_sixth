package com.neuedu.dao.impl;

import java.util.List;
import java.util.Map;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.neuedu.dao.ProviderDao;
import com.neuedu.model.Provider;


//spring����dao�ӿ�ʵ���࣬����spring���й���
@Repository
public class ProviderDaoImpl implements ProviderDao {

	 //����ע�룬����㼶������spring+mybatis
	@Autowired
	private SqlSessionTemplate sst;
	public void setSqlSessionTemplate(SqlSessionTemplate sst) {
		this.sst = sst;
	}	
	
	
	@Override
	public int countProvider() {
		// TODO �Զ����ɵķ������
		return sst.getMapper(ProviderDao.class).countProvider();
	}

	@Override
	public List<Provider> findAll(Map<String, Object> map) {
		// TODO �Զ����ɵķ������
		return sst.getMapper(ProviderDao.class).findAll(map);
	}

	@Override
	public int addProvider(Provider u) {
		// TODO �Զ����ɵķ������
		return sst.getMapper(ProviderDao.class).addProvider(u);
	}

	@Override
	public int updateProvider(Provider u) {
		// TODO �Զ����ɵķ������
		return sst.getMapper(ProviderDao.class).updateProvider(u);
	}

	@Override
	public int deleteProvider(int id) {
		// TODO �Զ����ɵķ������
		return sst.getMapper(ProviderDao.class).deleteProvider(id);
	}


	@Override
	public List<Provider> findList() {
		// TODO �Զ����ɵķ������
		return sst.getMapper(ProviderDao.class).findList();
	}



}
