package com.neuedu.dao;

import java.util.List;
import java.util.Map;

import com.neuedu.model.*;

public interface ProviderDao {

	//ͳ��
	public int countProvider();
	
	//��ѯ
	public List<Provider> findAll(Map<String, Object> map);
	
	//���
	public int addProvider(Provider u);
	
	//����
	public int updateProvider(Provider u);
	
	//ɾ��
	public int deleteProvider(int id);
	
	
	/**
	 * ��ѯ�������ݣ�������������ʾ
	 * @return
	 */
	public List<Provider> findList();

	
}
