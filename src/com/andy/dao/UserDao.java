package com.andy.dao;

import java.util.List;

import com.andy.type.User;

public interface UserDao {

	public List<User> findAllUser();

	public User findUser(String name);

	public void insertUser(String username, String password);

}
