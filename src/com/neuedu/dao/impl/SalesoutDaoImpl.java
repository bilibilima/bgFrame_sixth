package com.neuedu.dao.impl;

import java.util.List;
import java.util.Map;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.neuedu.dao.SalesoutDao;
import com.neuedu.model.Salesout;


//spring����dao�ӿ�ʵ���࣬����spring���й���
@Repository
public class SalesoutDaoImpl implements SalesoutDao {
	 //����ע�룬����㼶������spring+mybatis
	@Autowired
	private SqlSessionTemplate sst;
	public void setSqlSessionTemplate(SqlSessionTemplate sst) {
		this.sst = sst;
	}	
	
	
	
	
	@Override
	public int countSalesout() {
		// TODO �Զ����ɵķ������
		return sst.getMapper(SalesoutDao.class).countSalesout();
	}

	@Override
	public List<Salesout> findAll(Map<String, Object> map) {
		// TODO �Զ����ɵķ������
		return sst.getMapper(SalesoutDao.class).findAll(map);
	}

	@Override
	public int addSalesout(Salesout u) {
		// TODO �Զ����ɵķ������
		return sst.getMapper(SalesoutDao.class).addSalesout(u);
	}

	@Override
	public int updateSalesout(Salesout u) {
		// TODO �Զ����ɵķ������
		return sst.getMapper(SalesoutDao.class).updateSalesout(u);
	}

	@Override
	public int deleteSalesout(int id) {
		// TODO �Զ����ɵķ������
		return sst.getMapper(SalesoutDao.class).deleteSalesout(id);
	}

}
