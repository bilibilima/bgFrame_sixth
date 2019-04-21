package com.neuedu.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.neuedu.dao.UserDao;
import com.neuedu.dao.UserMessageDao;
import com.neuedu.model.UserMessage;
import com.neuedu.model.Users;
import com.neuedu.service.UserMessageService;
@Service
public class UserMessageImpl implements UserMessageService {

	@Autowired
	private UserMessageDao umd;
	public void setUserMessageDao(UserMessageDao umd) {
		this.umd = umd;
	}	
	
	
	
	
	@Override
	public List<UserMessage> getAll(Map<String, Object> map) {
		// TODO 自动生成的方法存根
		return umd.findAll(map);
	}

	@Override
	public int countUserMessage() {
		// TODO 自动生成的方法存根
		return umd.countUserMessage();
	}

	@Override
	public int addUserMessage(UserMessage u) {
		// TODO 自动生成的方法存根
		return umd.addUserMessage(u);
	}

	@Override
	public int updateUserMessage(UserMessage u) {
		// TODO 自动生成的方法存根
		return umd.updateUserMessage(u);
	}

	@Override
	public int deleteUserMessage(int id) {
		// TODO 自动生成的方法存根
		return umd.deleteUserMessage(id);
	}




	@Override
	public UserMessage login(UserMessage u) {
		// TODO 自动生成的方法存根
		return umd.login(u);
	}

}
