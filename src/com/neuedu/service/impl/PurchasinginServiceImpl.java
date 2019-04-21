package com.neuedu.service.impl;

import java.util.List;
import java.util.Map;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.neuedu.dao.PurchasinginDao;
import com.neuedu.model.Purchasingin;
import com.neuedu.service.PurchasinginService;



//spring，把dao接口实现类，交给spring进行管理
@Repository
public class PurchasinginServiceImpl implements PurchasinginService {

	/**
	 * 依赖注入，代码层级的整合spring+mybatis
	 */
	@Autowired
	private SqlSessionTemplate sst;
	public void setSqlSessionTemplate(SqlSessionTemplate sst) {
		this.sst = sst;
	}		
	
	
	
	
	@Override
	public List<Purchasingin> getAll(Map<String, Object> map) {
		// TODO 自动生成的方法存根
		return sst.getMapper(PurchasinginDao.class).findAll(map);
	}

	@Override
	public int countPurchasingin() {
		// TODO 自动生成的方法存根
		return sst.getMapper(PurchasinginDao.class).countPurchasingin();
	}

	@Override
	public int addPurchasingin(Purchasingin u) {
		// TODO 自动生成的方法存根
		return sst.getMapper(PurchasinginDao.class).addPurchasingin(u);
	}

	@Override
	public int updatePurchasingin(Purchasingin u) {
		// TODO 自动生成的方法存根
		return sst.getMapper(PurchasinginDao.class).updatePurchasingin(u);
	}

	@Override
	public int deletePurchasingin(int id) {
		// TODO 自动生成的方法存根
		return sst.getMapper(PurchasinginDao.class).deletePurchasingin(id);
	}

}
