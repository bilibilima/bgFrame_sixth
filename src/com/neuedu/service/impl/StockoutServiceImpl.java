package com.neuedu.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.neuedu.dao.*;
import com.neuedu.model.*;
import com.neuedu.service.*;

@Service
public class StockoutServiceImpl implements StockoutService {

	@Autowired
	private StockoutDao pd;
	public void setClient(StockoutDao pd) {
		this.pd = pd;
	}		
	
	
	
	
	@Override
	public List<Stockout> getAll(Map<String, Object> map) {
		// TODO �Զ����ɵķ������
		return pd.findAll(map);
	}

	@Override
	public int countStockout() {
		// TODO �Զ����ɵķ������
		return pd.countStockout();
	}

	@Override
	public int addStockout(Stockout u) {
		// TODO �Զ����ɵķ������
		return pd.addStockout(u);
	}

	@Override
	public int updateStockout(Stockout u) {
		// TODO �Զ����ɵķ������
		return pd.updateStockout(u);
	}

	@Override
	public int deleteStockout(int id) {
		// TODO �Զ����ɵķ������
		return pd.deleteStockout(id);
	}

}
