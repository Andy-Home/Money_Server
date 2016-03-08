package com.andy.type;

import java.util.List;

import com.andy.dao.UserDao;

public class User {
	private String id = "0";
	private String name;
	private String password;
	private UserDao userDao;
	
	public User(){}
	
	public User(String name, String password){
		this.name = name;
		this.password = password;
	}
	
	public List<User> findAllUser(){
		return userDao.findAllUser();
	}
	
	public User findUser(String name){
		return userDao.findUser(name);
	}
	
	public User insertUser(String username) {
		return userDao.insertUser(username);
	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	public UserDao getUserDao() {
		return userDao;
	}
	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}

}
