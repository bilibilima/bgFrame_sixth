package com.neuedu.dao;

import java.util.*;

import com.neuedu.model.UserMessage;
import com.neuedu.model.Users;

public interface UserMessageDao {
	public int countUserMessage();
	
	public List<UserMessage> findAll(Map<String, Object> map);
	
	public UserMessage login(UserMessage u);
	
	public int addUserMessage(UserMessage u);
	
	public int updateUserMessage(UserMessage u);
	
	public int deleteUserMessage(int id);

}
