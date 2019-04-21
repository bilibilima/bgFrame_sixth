package com.neuedu.service;

import java.util.List;
import java.util.Map;

import com.neuedu.model.UserMessage;
import com.neuedu.model.Users;

public interface UserMessageService {

	public List<UserMessage> getAll(Map<String,Object> map);
	public UserMessage login(UserMessage u);
	public int countUserMessage();
	public int addUserMessage(UserMessage u);
	public int updateUserMessage(UserMessage u);
	public int deleteUserMessage(int id);	
	
}
