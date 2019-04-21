package com.neuedu.dao.impl;

import java.util.List;
import java.util.Map;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.neuedu.dao.SalesoutDao;
import com.neuedu.model.Salesout;


//spring，把dao接口实现类，交给spring进行管理
@Repository
public class SalesoutDaoImpl implements SalesoutDao {
	 //依赖注入，代码层级的整合spring+mybatis
	@Autowired
	private SqlSessionTemplate sst;
	public void setSqlSessionTemplate(SqlSessionTemplate sst) {
		this.sst = sst;
	}	
	
	
	
	
	@Override
	public int countSalesout() {
		// TODO 自动生成的方法存根
		return sst.getMapper(SalesoutDao.class).countSalesout();
	}

	@Override
	public List<Salesout> findAll(Map<String, Object> map) {
		// TODO 自动生成的方法存根
		return sst.getMapper(SalesoutDao.class).findAll(map);
	}

	@Override
	public int addSalesout(Salesout u) {
		// TODO 自动生成的方法存根
		return sst.getMapper(SalesoutDao.class).addSalesout(u);
	}

	@Override
	public int updateSalesout(Salesout u) {
		// TODO 自动生成的方法存根
		return sst.getMapper(SalesoutDao.class).updateSalesout(u);
	}

	@Override
	public int deleteSalesout(int id) {
		// TODO 自动生成的方法存根
		return sst.getMapper(SalesoutDao.class).deleteSalesout(id);
	}

}
