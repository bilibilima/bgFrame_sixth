package com.neuedu.dao.impl;

import java.util.List;
import java.util.Map;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.neuedu.dao.*;
import com.neuedu.model.*;


//spring，把dao接口实现类，交给spring进行管理
@Repository


public class StockoutDaoImpl implements StockoutDao {

	 //依赖注入，代码层级的整合spring+mybatis
	@Autowired
	private SqlSessionTemplate sst;
	public void setSqlSessionTemplate(SqlSessionTemplate sst) {
		this.sst = sst;
	}		
	
	
	
	
	@Override
	public int countStockout() {
		// TODO 自动生成的方法存根
		return sst.getMapper(StockoutDao.class).countStockout();
	}

	@Override
	public List<Stockout> findAll(Map<String, Object> map) {
		// TODO 自动生成的方法存根
		return sst.getMapper(StockoutDao.class).findAll(map);
	}

	@Override
	public int addStockout(Stockout u) {
		// TODO 自动生成的方法存根
		return sst.getMapper(StockoutDao.class).addStockout(u);
	}

	@Override
	public int updateStockout(Stockout u) {
		// TODO 自动生成的方法存根
		return sst.getMapper(StockoutDao.class).updateStockout(u);
	}

	@Override
	public int deleteStockout(int id) {
		// TODO 自动生成的方法存根
		return sst.getMapper(StockoutDao.class).deleteStockout(id);
	}

}
