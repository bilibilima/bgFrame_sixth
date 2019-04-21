package com.neuedu.dao.impl;

import java.util.List;
import java.util.Map;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.neuedu.dao.StorageDao;
import com.neuedu.model.Storage;


/**
 * spring����dao�ӿ�ʵ���࣬����spring���й���
 */
@Repository
public class StorageDaoImpl implements StorageDao {

	/**
	 * ����ע�룬����㼶������spring+mybatis
	 */
	@Autowired
	private SqlSessionTemplate sst;
	public void setSqlSessionTemplate(SqlSessionTemplate sst) {
		this.sst = sst;
	}	
	
	
	
	
	@Override
	public int countStorage() {
		// TODO �Զ����ɵķ������
		return sst.getMapper(StorageDao.class).countStorage();
	}

	@Override
	public List<Storage> findAll(Map<String, Object> map) {
		// TODO �Զ����ɵķ������
		return sst.getMapper(StorageDao.class).findAll(map);
	}

	@Override
	public int addStorage(Storage u) {
		// TODO �Զ����ɵķ������
		return sst.getMapper(StorageDao.class).addStorage(u);
	}

	@Override
	public int updateStorage(Storage u) {
		// TODO �Զ����ɵķ������
		return sst.getMapper(StorageDao.class).updateStorage(u);
	}

	@Override
	public int deleteStorage(int id) {
		// TODO �Զ����ɵķ������
		return sst.getMapper(StorageDao.class).deleteStorage(id);
	}

}
