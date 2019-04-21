package com.neuedu.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.neuedu.dao.GoodsTypeDao;
import com.neuedu.dao.StorageDao;
import com.neuedu.model.GoodsType;
import com.neuedu.service.GoodsTypeService;

@Service
public class GoodsTypeServiceImpl implements GoodsTypeService {

	@Autowired
	private GoodsTypeDao gtd;
	public void setGoodsType(GoodsTypeDao gtd) {
		this.gtd = gtd;
	}		
	
	
	@Override
	public List<GoodsType> getAll(Map<String, Object> map) {
		// TODO �Զ����ɵķ������
		return gtd.findAll(map);
	}

	@Override
	public int countGoodsType() {
		// TODO �Զ����ɵķ������
		return gtd.countGoodsType();
	}

	@Override
	public int addGoodsType(GoodsType u) {
		// TODO �Զ����ɵķ������
		return gtd.addGoodsType(u);
	}

	@Override
	public int updateGoodsType(GoodsType u) {
		// TODO �Զ����ɵķ������
		return gtd.updateGoodsType(u);
	}

	@Override
	public int deleteGoodsType(int id) {
		// TODO �Զ����ɵķ������
		return gtd.deleteGoodsType(id);
	}


	@Override
	public List<GoodsType> findList() {
		// TODO �Զ����ɵķ������
		return gtd.findList();
	}

}
