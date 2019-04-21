package com.neuedu.dao.impl;

import java.util.List;
import java.util.Map;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.neuedu.dao.*;
import com.neuedu.model.*;


//spring����dao�ӿ�ʵ���࣬����spring���й���
@Repository


public class StockoutDaoImpl implements StockoutDao {

	 //����ע�룬����㼶������spring+mybatis
	@Autowired
	private SqlSessionTemplate sst;
	public void setSqlSessionTemplate(SqlSessionTemplate sst) {
		this.sst = sst;
	}		
	
	
	
	
	@Override
	public int countStockout() {
		// TODO �Զ����ɵķ������
		return sst.getMapper(StockoutDao.class).countStockout();
	}

	@Override
	public List<Stockout> findAll(Map<String, Object> map) {
		// TODO �Զ����ɵķ������
		return sst.getMapper(StockoutDao.class).findAll(map);
	}

	@Override
	public int addStockout(Stockout u) {
		// TODO �Զ����ɵķ������
		return sst.getMapper(StockoutDao.class).addStockout(u);
	}

	@Override
	public int updateStockout(Stockout u) {
		// TODO �Զ����ɵķ������
		return sst.getMapper(StockoutDao.class).updateStockout(u);
	}

	@Override
	public int deleteStockout(int id) {
		// TODO �Զ����ɵķ������
		return sst.getMapper(StockoutDao.class).deleteStockout(id);
	}

}
