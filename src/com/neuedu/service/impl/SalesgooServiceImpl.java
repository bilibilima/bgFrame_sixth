package com.neuedu.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.neuedu.dao.*;
import com.neuedu.model.Salesgoo;
import com.neuedu.service.SalesgooService;
@Service
public class SalesgooServiceImpl implements SalesgooService {

	@Autowired
	private SalesgooDao pd;
	public void setClient(SalesgooDao pd) {
		this.pd = pd;
	}	
	
	
	
	@Override
	public int countSalesgoo() {
		// TODO �Զ����ɵķ������
		return pd.countSalesgoo();
	}

	@Override
	public int addSalesgoo(Salesgoo u) {
		// TODO �Զ����ɵķ������
		return pd.addSalesgoo(u);
	}

	@Override
	public int updateSalesgoo(Salesgoo u) {
		// TODO �Զ����ɵķ������
		return pd.updateSalesgoo(u);
	}

	@Override
	public int deleteSalesgoo(int id) {
		// TODO �Զ����ɵķ������
		return pd.deleteSalesgoo(id);
	}



	@Override
	public List<Salesgoo> getAll(Map<String, Object> map) {
		// TODO �Զ����ɵķ������
		return pd.findAll(map);
	}

}
