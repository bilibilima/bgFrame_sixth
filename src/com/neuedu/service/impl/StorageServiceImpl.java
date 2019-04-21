package com.neuedu.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.neuedu.dao.StorageDao;
import com.neuedu.dao.UserMessageDao;
import com.neuedu.model.Storage;
import com.neuedu.service.StorageService;


@Service
public class StorageServiceImpl implements StorageService {

	@Autowired
	private StorageDao sta;
	public void setStorage(StorageDao sta) {
		this.sta = sta;
	}			
	
	
	
	@Override
	public List<Storage> getAll(Map<String, Object> map) {
		// TODO �Զ����ɵķ������
		return sta.findAll(map);
	}

	@Override
	public int countStorage() {
		// TODO �Զ����ɵķ������
		return sta.countStorage();
	}

	@Override
	public int addStorage(Storage u) {
		// TODO �Զ����ɵķ������
		return sta.addStorage(u);
	}

	@Override
	public int updateStorage(Storage u) {
		// TODO �Զ����ɵķ������
		return sta.updateStorage(u);
	}

	@Override
	public int deleteStorage(int id) {
		// TODO �Զ����ɵķ������
		return sta.deleteStorage(id);
	}

}
