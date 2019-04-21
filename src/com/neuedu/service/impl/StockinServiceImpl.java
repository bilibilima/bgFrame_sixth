package com.neuedu.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.neuedu.dao.*;
import com.neuedu.model.*;
import com.neuedu.service.*;

@Service
public class StockinServiceImpl implements StockinService {

	@Autowired
	private StockinDao pd;
	public void setClient(StockinDao pd) {
		this.pd = pd;
	}		
	
	
	
	@Override
	public List<Stockin> getAll(Map<String, Object> map) {
		// TODO 自动生成的方法存根
		return pd.findAll(map);
	}

	@Override
	public int countStockin() {
		// TODO 自动生成的方法存根
		return pd.countStockin();
	}

	@Override
	public int addStockin(Stockin u) {
		// TODO 自动生成的方法存根
		return pd.addStockin(u);
	}

	@Override
	public int updateStockin(Stockin u) {
		// TODO 自动生成的方法存根
		return pd.updateStockin(u);
	}

	@Override
	public int deleteStockin(int id) {
		// TODO 自动生成的方法存根
		return pd.deleteStockin(id);
	}

}
