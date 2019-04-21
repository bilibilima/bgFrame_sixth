package com.neuedu.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.neuedu.dao.*;
import com.neuedu.model.*;
import com.neuedu.service.*;

@Service
public class SalesoutServiceImpl implements SalesoutService {

	@Autowired
	private SalesoutDao pd;
	public void setClient(SalesoutDao pd) {
		this.pd = pd;
	}		
	
	@Override
	public List<Salesout> getAll(Map<String, Object> map) {
		// TODO 自动生成的方法存根
		return pd.findAll(map);
	}

	@Override
	public int countSalesout() {
		// TODO 自动生成的方法存根
		return pd.countSalesout();
	}

	@Override
	public int addSalesout(Salesout u) {
		// TODO 自动生成的方法存根
		return pd.addSalesout(u);
	}

	@Override
	public int updateSalesout(Salesout u) {
		// TODO 自动生成的方法存根
		return pd.updateSalesout(u);
	}

	@Override
	public int deleteSalesout(int id) {
		// TODO 自动生成的方法存根
		return pd.deleteSalesout(id);
	}

}
