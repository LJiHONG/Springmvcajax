package com.liu.po;

import java.util.Arrays;

public class UserInfo {
	private int userID;
	private String userName;
	private String userSex;
	private String[] userxq;
	public String[] getUserxq() {
		return userxq;
	}
	public void setUserxq(String[] userxq) {
		this.userxq = userxq;
	}
	public int getUserID() {
		return userID;
	}
	public void setUserID(int userID) {
		this.userID = userID;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserSex() {
		return userSex;
	}
	public void setUserSex(String userSex) {
		this.userSex = userSex;
	}
	@Override
	public String toString() {
		return "UserInfo [userID=" + userID + ", userName=" + userName + ", userSex=" + userSex + ", userxq="
				+ Arrays.toString(userxq) + "]";
	}
	
}
