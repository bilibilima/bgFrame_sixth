package com.neuedu.service;

import java.util.List;
import java.util.Map;

import com.neuedu.model.*;

public interface ProviderService {

	//��ѯ
	public List<Provider> getAll(Map<String,Object> map);
	
	//ͳ��
	public int countProvider();
	
	//���
	public int addProvider(Provider u);
	
	//���
	public int updateProvider(Provider u);
	
	//ɾ��
	public int deleteProvider(int id);	
	/**
	 * ��ѯ�������ݣ�������������ʾ
	 * @return
	 */
	public List<Provider> findList();	

	
	
	
}
