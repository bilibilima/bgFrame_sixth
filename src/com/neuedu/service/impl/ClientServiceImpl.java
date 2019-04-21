package com.neuedu.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.neuedu.dao.ClientDao;
import com.neuedu.dao.GoodsTypeDao;
import com.neuedu.model.Client;
import com.neuedu.service.ClientService;
@Service
public class ClientServiceImpl implements ClientService {

	@Autowired
	private ClientDao cld;
	public void setClient(ClientDao cld) {
		this.cld = cld;
	}	
	
	
	
	@Override
	public List<Client> getAll(Map<String, Object> map) {
		// TODO �Զ����ɵķ������
		return cld.findAll(map);
	}

	@Override
	public int countClient() {
		// TODO �Զ����ɵķ������
		return cld.countClient();
	}

	@Override
	public int addClient(Client u) {
		// TODO �Զ����ɵķ������
		return cld.addClient(u);
	}

	@Override
	public int updateClient(Client u) {
		// TODO �Զ����ɵķ������
		return cld.updateClient(u);
	}

	@Override
	public int deleteClient(int id) {
		// TODO �Զ����ɵķ������
		return cld.deleteClient(id);
	}

}
