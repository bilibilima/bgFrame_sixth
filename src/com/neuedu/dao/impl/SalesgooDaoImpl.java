package com.neuedu.dao.impl;

import java.util.List;
import java.util.Map;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.neuedu.dao.SalesgooDao;
import com.neuedu.model.Salesgoo;


//spring，把dao接口实现类，交给spring进行管理
@Repository
public class SalesgooDaoImpl implements SalesgooDao {
	 //依赖注入，代码层级的整合spring+mybatis
	@Autowired
	private SqlSessionTemplate sst;
	public void setSqlSessionTemplate(SqlSessionTemplate sst) {
		this.sst = sst;
	}	
	
	
	@Override
	public List<Salesgoo> findAll(Map<String, Object> map) {
		// TODO 自动生成的方法存根
		return sst.getMapper(SalesgooDao.class).findAll(map);
	}

	@Override
	public int addSalesgoo(Salesgoo u) {
		// TODO 自动生成的方法存根
		return sst.getMapper(SalesgooDao.class).addSalesgoo(u);
	}

	@Override
	public int updateSalesgoo(Salesgoo u) {
		// TODO 自动生成的方法存根
		return sst.getMapper(SalesgooDao.class).updateSalesgoo(u);
	}

	@Override
	public int deleteSalesgoo(int id) {
		// TODO 自动生成的方法存根
		return sst.getMapper(SalesgooDao.class).deleteSalesgoo(id);
	}


	@Override
	public int countSalesgoo() {
		// TODO 自动生成的方法存根
		return sst.getMapper(SalesgooDao.class).countSalesgoo();
	}

}
