package com.neuedu.model;

import java.util.Date;

public class UserMessage {
	private int userNo;
	private String userName;
	private String nickName;
	private String password;
	private int userPhone;
	private String userEmail;
	private String userDate;
	
	public UserMessage() {
		super();
		// TODO 自动生成的构造函数存根
	}

	public UserMessage(int userNo, String userName, String nickName, String password, int userPhone, String userEmail,
			String userDate) {
		super();
		this.userNo = userNo;
		this.userName = userName;
		this.nickName = nickName;
		this.password = password;
		this.userPhone = userPhone;
		this.userEmail = userEmail;
		this.userDate = userDate;
	}

	public int getUserNo() {
		return userNo;
	}

	public void setUserNo(int userNo) {
		this.userNo = userNo;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getNickName() {
		return nickName;
	}

	public void setNickName(String nickName) {
		this.nickName = nickName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getUserPhone() {
		return userPhone;
	}

	public void setUserPhone(int userPhone) {
		this.userPhone = userPhone;
	}

	public String getUserEmail() {
		return userEmail;
	}

	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}

	public String getUserDate() {
		return userDate;
	}

	public void setUserDate(String userDate) {
		this.userDate = userDate;
	}
	
	
	
}
