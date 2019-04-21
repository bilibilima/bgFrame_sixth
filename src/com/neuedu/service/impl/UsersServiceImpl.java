package com.neuedu.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.neuedu.dao.UserDao;
import com.neuedu.model.Users;
import com.neuedu.service.UsersService;

@Service
public class UsersServiceImpl implements UsersService {
	@Autowired
	private UserDao userDao;

	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}

	@Override
	public List<Users> getAll(Map<String,Object> map) {
		return userDao.findAll(map);
	}

	@Override
	public int countUsers() {
		return userDao.countUsers();
	}

	@Override
	public int addUsers(Users u) {
		return userDao.addUsers(u);
	}

	@Override
	public int updateUsers(Users u) {
		return userDao.updateUsers(u);
	}

	@Override
	public int deleteUsers(int id) {
		return userDao.deleteUsers(id);
	}
	
}
