package com.neuedu.dao;

import java.util.List;
import java.util.Map;

import com.neuedu.model.Users;

public interface UserDao {
	public int countUsers();
	public List<Users> findAll(Map<String, Object> map);
	public int addUsers(Users u);
	public int updateUsers(Users u);
	public int deleteUsers(int id);
	
}
