package com.neuedu.dao.impl;

import java.util.List;
import java.util.Map;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.neuedu.dao.PurchasinginDao;
import com.neuedu.model.Purchasingin;




// spring����dao�ӿ�ʵ���࣬����spring���й���
@Repository
public class PurchasinginDaoImpl implements PurchasinginDao {

	//����ע�룬����㼶������spring+mybatis
	@Autowired
	private SqlSessionTemplate sst;
	public void setSqlSessionTemplate(SqlSessionTemplate sst) {
		this.sst = sst;
	}		
	
	
	
	@Override
	public int countPurchasingin() {
		// TODO �Զ����ɵķ������
		return sst.getMapper(PurchasinginDao.class).countPurchasingin();
	}

	@Override
	public List<Purchasingin> findAll(Map<String, Object> map) {
		// TODO �Զ����ɵķ������
		return sst.getMapper(PurchasinginDao.class).findAll(map);
	}

	@Override
	public int addPurchasingin(Purchasingin u) {
		// TODO �Զ����ɵķ������
		return sst.getMapper(PurchasinginDao.class).addPurchasingin(u);
	}

	@Override
	public int updatePurchasingin(Purchasingin u) {
		// TODO �Զ����ɵķ������
		return sst.getMapper(PurchasinginDao.class).updatePurchasingin(u);
	}

	@Override
	public int deletePurchasingin(int id) {
		// TODO �Զ����ɵķ������
		return sst.getMapper(PurchasinginDao.class).deletePurchasingin(id);
	}

}