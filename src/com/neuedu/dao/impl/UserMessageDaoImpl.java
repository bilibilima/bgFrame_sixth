package com.neuedu.dao.impl;

import java.util.List;
import java.util.Map;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.neuedu.dao.UserDao;
import com.neuedu.dao.UserMessageDao;
import com.neuedu.model.UserMessage;
/**
 * spring，把dao接口实现类，交给spring进行管理
 */
@Repository
public class UserMessageDaoImpl implements UserMessageDao {
	
	/**
	 * 依赖注入，代码层级的整合spring+mybatis
	 */
	@Autowired
	private SqlSessionTemplate sqlSessionTemplate;
	public void setSqlSessionTemplate(SqlSessionTemplate sqlSessionTemplate) {
		this.sqlSessionTemplate = sqlSessionTemplate;
	}
	
	
	@Override
	public int countUserMessage() {
		// TODO 自动生成的方法存根
		return sqlSessionTemplate.getMapper(UserMessageDao.class).countUserMessage();
	}

	@Override
	public List<UserMessage> findAll(Map<String, Object> map) {
		// TODO 自动生成的方法存根
		return sqlSessionTemplate.getMapper(UserMessageDao.class).findAll(map);
	}

	@Override
	public int addUserMessage(UserMessage u) {
		// TODO 自动生成的方法存根
		return sqlSessionTemplate.getMapper(UserMessageDao.class).addUserMessage(u);
	}

	@Override
	public int updateUserMessage(UserMessage u) {
		// TODO 自动生成的方法存根
		return sqlSessionTemplate.getMapper(UserMessageDao.class).updateUserMessage(u);
	}

	@Override
	public int deleteUserMessage(int id) {
		// TODO 自动生成的方法存根
		return sqlSessionTemplate.getMapper(UserMessageDao.class).deleteUserMessage(id);
	}


	@Override
	public UserMessage login(UserMessage u) {
		// TODO 自动生成的方法存根
		return sqlSessionTemplate.getMapper(UserMessageDao.class).login(u);
	}

	
}
