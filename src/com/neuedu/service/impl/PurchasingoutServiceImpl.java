package com.neuedu.service.impl;

import java.util.List;
import java.util.Map;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.neuedu.dao.PurchasingoutDao;
import com.neuedu.model.Purchasingout;
import com.neuedu.service.PurchasingoutService;


//spring，把dao接口实现类，交给spring进行管理
@Repository
public class PurchasingoutServiceImpl implements PurchasingoutService {

	//依赖注入，代码层级的整合spring+mybatis
	@Autowired
	private SqlSessionTemplate sst;
	public void setSqlSessionTemplate(SqlSessionTemplate sst) {
		this.sst = sst;
	}		
	
	@Override
	public List<Purchasingout> getAll(Map<String, Object> map) {
		// TODO 自动生成的方法存根
		return sst.getMapper(PurchasingoutDao.class).findAll(map);
	}

	@Override
	public int countPurchasingout() {
		// TODO 自动生成的方法存根
		return sst.getMapper(PurchasingoutDao.class).countPurchasingout();
	}

	@Override
	public int addPurchasingout(Purchasingout u) {
		// TODO 自动生成的方法存根
		return sst.getMapper(PurchasingoutDao.class).addPurchasingout(u);
	}

	@Override
	public int updatePurchasingout(Purchasingout u) {
		// TODO 自动生成的方法存根
		return sst.getMapper(PurchasingoutDao.class).updatePurchasingout(u);
	}

	@Override
	public int deletePurchasingout(int id) {
		// TODO 自动生成的方法存根
		return sst.getMapper(PurchasingoutDao.class).deletePurchasingout(id);
	}

}
