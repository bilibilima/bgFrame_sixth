package com.neuedu.dao.impl;

import java.util.List;
import java.util.Map;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.neuedu.dao.GoodsTypeDao;
import com.neuedu.model.GoodsType;


/**
 * spring����dao�ӿ�ʵ���࣬����spring���й���
 */
@Repository
public class GoodsTypeDaoImpl implements GoodsTypeDao {

	/**
	 * ����ע�룬����㼶������spring+mybatis
	 */
	@Autowired
	private SqlSessionTemplate sst;
	public void setSqlSessionTemplate(SqlSessionTemplate sst) {
		this.sst = sst;
	}		
	
	
	@Override
	public int countGoodsType() {
		// TODO �Զ����ɵķ������
		return sst.getMapper(GoodsTypeDao.class).countGoodsType();
	}

	@Override
	public List<GoodsType> findAll(Map<String, Object> map) {
		// TODO �Զ����ɵķ������
		return sst.getMapper(GoodsTypeDao.class).findAll(map);
	}

	@Override
	public int addGoodsType(GoodsType u) {
		// TODO �Զ����ɵķ������
		return sst.getMapper(GoodsTypeDao.class).addGoodsType(u);
	}

	@Override
	public int updateGoodsType(GoodsType u) {
		// TODO �Զ����ɵķ������
		return sst.getMapper(GoodsTypeDao.class).updateGoodsType(u);
	}

	@Override
	public int deleteGoodsType(int id) {
		// TODO �Զ����ɵķ������
		return sst.getMapper(GoodsTypeDao.class).deleteGoodsType(id);
	}


	@Override
	public List<GoodsType> findList() {
		// TODO �Զ����ɵķ������
		return sst.getMapper(GoodsTypeDao.class).findList();
	}

}
