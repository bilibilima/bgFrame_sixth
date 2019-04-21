package com.neuedu.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.neuedu.dao.*;
import com.neuedu.model.*;
import com.neuedu.service.*;


@Service
public class ProviderServiceImpl implements ProviderService {

	@Autowired
	private ProviderDao pd;
	public void setClient(ProviderDao pd) {
		this.pd = pd;
	}		
	
	
	
	@Override
	public List<Provider> getAll(Map<String, Object> map) {
		// TODO 自动生成的方法存根
		return pd.findAll(map);
	}

	@Override
	public int countProvider() {
		// TODO 自动生成的方法存根
		return pd.countProvider();
	}

	@Override
	public int addProvider(Provider u) {
		// TODO 自动生成的方法存根
		return pd.addProvider(u);
	}

	@Override
	public int updateProvider(Provider u) {
		// TODO 自动生成的方法存根
		return pd.updateProvider(u);
	}

	@Override
	public int deleteProvider(int id) {
		// TODO 自动生成的方法存根
		return pd.deleteProvider(id);
	}



	@Override
	public List<Provider> findList() {
		// TODO 自动生成的方法存根
		return pd.findList();
	}











}
