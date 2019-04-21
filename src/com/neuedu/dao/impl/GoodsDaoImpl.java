package com.neuedu.dao.impl;

import java.util.List;
import java.util.Map;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.neuedu.dao.GoodsDao;
import com.neuedu.model.Goods;


//spring，把dao接口实现类，交给spring进行管理
@Repository
public class GoodsDaoImpl implements GoodsDao {

	 //依赖注入，代码层级的整合spring+mybatis
	@Autowired
	private SqlSessionTemplate sst;
	public void setSqlSessionTemplate(SqlSessionTemplate sst) {
		this.sst = sst;
	}		
	
	
	
	@Override
	public int countGoods() {
		// TODO 自动生成的方法存根
		return sst.getMapper(GoodsDao.class).countGoods();
	}

	@Override
	public List<Goods> findAll(Map<String, Object> map) {
		// TODO 自动生成的方法存根
		return sst.getMapper(GoodsDao.class).findAll(map);
	}

	@Override
	public int addGoods(Goods u) {
		// TODO 自动生成的方法存根
		return sst.getMapper(GoodsDao.class).addGoods(u);
	}

	@Override
	public int updateGoods(Goods u) {
		// TODO 自动生成的方法存根
		return sst.getMapper(GoodsDao.class).updateGoods(u);
	}

	@Override
	public int deleteGoods(int id) {
		// TODO 自动生成的方法存根
		return sst.getMapper(GoodsDao.class).deleteGoods(id);
	}

}
