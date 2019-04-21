package com.neuedu.dao.impl;

import java.util.List;
import java.util.Map;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.neuedu.dao.StockinDao;
import com.neuedu.model.Stockin;


//spring，把dao接口实现类，交给spring进行管理
@Repository

public class StockinDaoImpl implements StockinDao {

	 //依赖注入，代码层级的整合spring+mybatis
	@Autowired
	private SqlSessionTemplate sst;
	public void setSqlSessionTemplate(SqlSessionTemplate sst) {
		this.sst = sst;
	}		
	
	
	
	
	@Override
	public int countStockin() {
		// TODO 自动生成的方法存根
		return sst.getMapper(StockinDao.class).countStockin();
	}

	@Override
	public List<Stockin> findAll(Map<String, Object> map) {
		// TODO 自动生成的方法存根
		return sst.getMapper(StockinDao.class).findAll(map);
	}

	@Override
	public int addStockin(Stockin u) {
		// TODO 自动生成的方法存根
		return sst.getMapper(StockinDao.class).addStockin(u);
	}

	@Override
	public int updateStockin(Stockin u) {
		// TODO 自动生成的方法存根
		return sst.getMapper(StockinDao.class).updateStockin(u);
	}

	@Override
	public int deleteStockin(int id) {
		// TODO 自动生成的方法存根
		return sst.getMapper(StockinDao.class).deleteStockin(id);
	}

}
