package com.neuedu.service;

import java.util.List;
import java.util.Map;

import com.neuedu.model.Users;

public interface UsersService {
	
	public List<Users> getAll(Map<String,Object> map);
	
	public int countUsers();
	public int addUsers(Users u);
	public int updateUsers(Users u);
	public int deleteUsers(int id);
}
