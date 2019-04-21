package com.neuedu.dao.impl;

import java.util.List;
import java.util.Map;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.neuedu.dao.UserDao;
import com.neuedu.model.Users;

@Repository
public class UserDaoImpl implements UserDao {
	
	@Autowired
	private SqlSessionTemplate sqlSessionTemplate;
	public void setSqlSessionTemplate(SqlSessionTemplate sqlSessionTemplate) {
		this.sqlSessionTemplate = sqlSessionTemplate;
	}
	
	@Override
	public List<Users> findAll(Map<String, Object> map) {
		return sqlSessionTemplate.getMapper(UserDao.class).findAll(map);
	}
	
	@Override
	public int countUsers() {
		return sqlSessionTemplate.getMapper(UserDao.class).countUsers();
	}
	
	@Override
	public int addUsers(Users u){
		return sqlSessionTemplate.getMapper(UserDao.class).addUsers(u);
	}
	
	@Override
	public int updateUsers(Users u) {
		return sqlSessionTemplate.getMapper(UserDao.class).updateUsers(u);
	}
	
	@Override
	public int deleteUsers(int id) {
		return sqlSessionTemplate.getMapper(UserDao.class).deleteUsers(id);
	}


}
