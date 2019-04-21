package com.neuedu.dao.impl;

import java.util.List;
import java.util.Map;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.neuedu.dao.GoodsTypeDao;
import com.neuedu.model.GoodsType;


/**
 * spring，把dao接口实现类，交给spring进行管理
 */
@Repository
public class GoodsTypeDaoImpl implements GoodsTypeDao {

	/**
	 * 依赖注入，代码层级的整合spring+mybatis
	 */
	@Autowired
	private SqlSessionTemplate sst;
	public void setSqlSessionTemplate(SqlSessionTemplate sst) {
		this.sst = sst;
	}		
	
	
	@Override
	public int countGoodsType() {
		// TODO 自动生成的方法存根
		return sst.getMapper(GoodsTypeDao.class).countGoodsType();
	}

	@Override
	public List<GoodsType> findAll(Map<String, Object> map) {
		// TODO 自动生成的方法存根
		return sst.getMapper(GoodsTypeDao.class).findAll(map);
	}

	@Override
	public int addGoodsType(GoodsType u) {
		// TODO 自动生成的方法存根
		return sst.getMapper(GoodsTypeDao.class).addGoodsType(u);
	}

	@Override
	public int updateGoodsType(GoodsType u) {
		// TODO 自动生成的方法存根
		return sst.getMapper(GoodsTypeDao.class).updateGoodsType(u);
	}

	@Override
	public int deleteGoodsType(int id) {
		// TODO 自动生成的方法存根
		return sst.getMapper(GoodsTypeDao.class).deleteGoodsType(id);
	}


	@Override
	public List<GoodsType> findList() {
		// TODO 自动生成的方法存根
		return sst.getMapper(GoodsTypeDao.class).findList();
	}

}
