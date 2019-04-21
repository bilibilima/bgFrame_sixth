package com.neuedu.dao.impl;

import java.util.List;
import java.util.Map;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.neuedu.dao.SalesgooDao;
import com.neuedu.model.Salesgoo;


//spring����dao�ӿ�ʵ���࣬����spring���й���
@Repository
public class SalesgooDaoImpl implements SalesgooDao {
	 //����ע�룬����㼶������spring+mybatis
	@Autowired
	private SqlSessionTemplate sst;
	public void setSqlSessionTemplate(SqlSessionTemplate sst) {
		this.sst = sst;
	}	
	
	
	@Override
	public List<Salesgoo> findAll(Map<String, Object> map) {
		// TODO �Զ����ɵķ������
		return sst.getMapper(SalesgooDao.class).findAll(map);
	}

	@Override
	public int addSalesgoo(Salesgoo u) {
		// TODO �Զ����ɵķ������
		return sst.getMapper(SalesgooDao.class).addSalesgoo(u);
	}

	@Override
	public int updateSalesgoo(Salesgoo u) {
		// TODO �Զ����ɵķ������
		return sst.getMapper(SalesgooDao.class).updateSalesgoo(u);
	}

	@Override
	public int deleteSalesgoo(int id) {
		// TODO �Զ����ɵķ������
		return sst.getMapper(SalesgooDao.class).deleteSalesgoo(id);
	}


	@Override
	public int countSalesgoo() {
		// TODO �Զ����ɵķ������
		return sst.getMapper(SalesgooDao.class).countSalesgoo();
	}

}
