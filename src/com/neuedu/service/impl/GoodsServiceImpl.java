package com.neuedu.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.neuedu.dao.*;
import com.neuedu.model.*;
import com.neuedu.service.*;

@Service
public class GoodsServiceImpl implements GoodsService {

	
	@Autowired
	private GoodsDao pd;
	public void setClient(GoodsDao pd) {
		this.pd = pd;
	}		
	
	
	@Override
	public List<Goods> getAll(Map<String, Object> map) {
		// TODO 自动生成的方法存根
		return pd.findAll(map);
	}

	@Override
	public int countGoods() {
		// TODO 自动生成的方法存根
		return pd.countGoods();
	}

	@Override
	public int addGoods(Goods u) {
		// TODO 自动生成的方法存根
		return pd.addGoods(u);
	}

	@Override
	public int updateGoods(Goods u) {
		// TODO 自动生成的方法存根
		return pd.updateGoods(u);
	}

	@Override
	public int deleteGoods(int id) {
		// TODO 自动生成的方法存根
		return pd.deleteGoods(id);
	}

}
