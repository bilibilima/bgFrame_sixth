package com.neuedu.service.impl;

import java.util.List;
import java.util.Map;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.neuedu.dao.PurchasingoutDao;
import com.neuedu.model.Purchasingout;
import com.neuedu.service.PurchasingoutService;


//spring����dao�ӿ�ʵ���࣬����spring���й���
@Repository
public class PurchasingoutServiceImpl implements PurchasingoutService {

	//����ע�룬����㼶������spring+mybatis
	@Autowired
	private SqlSessionTemplate sst;
	public void setSqlSessionTemplate(SqlSessionTemplate sst) {
		this.sst = sst;
	}		
	
	@Override
	public List<Purchasingout> getAll(Map<String, Object> map) {
		// TODO �Զ����ɵķ������
		return sst.getMapper(PurchasingoutDao.class).findAll(map);
	}

	@Override
	public int countPurchasingout() {
		// TODO �Զ����ɵķ������
		return sst.getMapper(PurchasingoutDao.class).countPurchasingout();
	}

	@Override
	public int addPurchasingout(Purchasingout u) {
		// TODO �Զ����ɵķ������
		return sst.getMapper(PurchasingoutDao.class).addPurchasingout(u);
	}

	@Override
	public int updatePurchasingout(Purchasingout u) {
		// TODO �Զ����ɵķ������
		return sst.getMapper(PurchasingoutDao.class).updatePurchasingout(u);
	}

	@Override
	public int deletePurchasingout(int id) {
		// TODO �Զ����ɵķ������
		return sst.getMapper(PurchasingoutDao.class).deletePurchasingout(id);
	}

}
