package com.neuedu.dao.impl;

import java.util.List;
import java.util.Map;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.neuedu.dao.GoodsDao;
import com.neuedu.model.Goods;


//spring����dao�ӿ�ʵ���࣬����spring���й���
@Repository
public class GoodsDaoImpl implements GoodsDao {

	 //����ע�룬����㼶������spring+mybatis
	@Autowired
	private SqlSessionTemplate sst;
	public void setSqlSessionTemplate(SqlSessionTemplate sst) {
		this.sst = sst;
	}		
	
	
	
	@Override
	public int countGoods() {
		// TODO �Զ����ɵķ������
		return sst.getMapper(GoodsDao.class).countGoods();
	}

	@Override
	public List<Goods> findAll(Map<String, Object> map) {
		// TODO �Զ����ɵķ������
		return sst.getMapper(GoodsDao.class).findAll(map);
	}

	@Override
	public int addGoods(Goods u) {
		// TODO �Զ����ɵķ������
		return sst.getMapper(GoodsDao.class).addGoods(u);
	}

	@Override
	public int updateGoods(Goods u) {
		// TODO �Զ����ɵķ������
		return sst.getMapper(GoodsDao.class).updateGoods(u);
	}

	@Override
	public int deleteGoods(int id) {
		// TODO �Զ����ɵķ������
		return sst.getMapper(GoodsDao.class).deleteGoods(id);
	}

}
