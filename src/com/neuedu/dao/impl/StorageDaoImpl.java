package com.neuedu.dao.impl;

import java.util.List;
import java.util.Map;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.neuedu.dao.StorageDao;
import com.neuedu.model.Storage;


/**
 * spring，把dao接口实现类，交给spring进行管理
 */
@Repository
public class StorageDaoImpl implements StorageDao {

	/**
	 * 依赖注入，代码层级的整合spring+mybatis
	 */
	@Autowired
	private SqlSessionTemplate sst;
	public void setSqlSessionTemplate(SqlSessionTemplate sst) {
		this.sst = sst;
	}	
	
	
	
	
	@Override
	public int countStorage() {
		// TODO 自动生成的方法存根
		return sst.getMapper(StorageDao.class).countStorage();
	}

	@Override
	public List<Storage> findAll(Map<String, Object> map) {
		// TODO 自动生成的方法存根
		return sst.getMapper(StorageDao.class).findAll(map);
	}

	@Override
	public int addStorage(Storage u) {
		// TODO 自动生成的方法存根
		return sst.getMapper(StorageDao.class).addStorage(u);
	}

	@Override
	public int updateStorage(Storage u) {
		// TODO 自动生成的方法存根
		return sst.getMapper(StorageDao.class).updateStorage(u);
	}

	@Override
	public int deleteStorage(int id) {
		// TODO 自动生成的方法存根
		return sst.getMapper(StorageDao.class).deleteStorage(id);
	}

}
