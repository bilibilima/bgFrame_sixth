package com.neuedu.dao.impl;

import java.util.List;
import java.util.Map;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.neuedu.dao.StockinDao;
import com.neuedu.model.Stockin;


//spring����dao�ӿ�ʵ���࣬����spring���й���
@Repository

public class StockinDaoImpl implements StockinDao {

	 //����ע�룬����㼶������spring+mybatis
	@Autowired
	private SqlSessionTemplate sst;
	public void setSqlSessionTemplate(SqlSessionTemplate sst) {
		this.sst = sst;
	}		
	
	
	
	
	@Override
	public int countStockin() {
		// TODO �Զ����ɵķ������
		return sst.getMapper(StockinDao.class).countStockin();
	}

	@Override
	public List<Stockin> findAll(Map<String, Object> map) {
		// TODO �Զ����ɵķ������
		return sst.getMapper(StockinDao.class).findAll(map);
	}

	@Override
	public int addStockin(Stockin u) {
		// TODO �Զ����ɵķ������
		return sst.getMapper(StockinDao.class).addStockin(u);
	}

	@Override
	public int updateStockin(Stockin u) {
		// TODO �Զ����ɵķ������
		return sst.getMapper(StockinDao.class).updateStockin(u);
	}

	@Override
	public int deleteStockin(int id) {
		// TODO �Զ����ɵķ������
		return sst.getMapper(StockinDao.class).deleteStockin(id);
	}

}
