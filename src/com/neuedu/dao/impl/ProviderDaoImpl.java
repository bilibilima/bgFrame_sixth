package com.neuedu.dao.impl;

import java.util.List;
import java.util.Map;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.neuedu.dao.ProviderDao;
import com.neuedu.model.Provider;


//spring，把dao接口实现类，交给spring进行管理
@Repository
public class ProviderDaoImpl implements ProviderDao {

	 //依赖注入，代码层级的整合spring+mybatis
	@Autowired
	private SqlSessionTemplate sst;
	public void setSqlSessionTemplate(SqlSessionTemplate sst) {
		this.sst = sst;
	}	
	
	
	@Override
	public int countProvider() {
		// TODO 自动生成的方法存根
		return sst.getMapper(ProviderDao.class).countProvider();
	}

	@Override
	public List<Provider> findAll(Map<String, Object> map) {
		// TODO 自动生成的方法存根
		return sst.getMapper(ProviderDao.class).findAll(map);
	}

	@Override
	public int addProvider(Provider u) {
		// TODO 自动生成的方法存根
		return sst.getMapper(ProviderDao.class).addProvider(u);
	}

	@Override
	public int updateProvider(Provider u) {
		// TODO 自动生成的方法存根
		return sst.getMapper(ProviderDao.class).updateProvider(u);
	}

	@Override
	public int deleteProvider(int id) {
		// TODO 自动生成的方法存根
		return sst.getMapper(ProviderDao.class).deleteProvider(id);
	}


	@Override
	public List<Provider> findList() {
		// TODO 自动生成的方法存根
		return sst.getMapper(ProviderDao.class).findList();
	}



}
