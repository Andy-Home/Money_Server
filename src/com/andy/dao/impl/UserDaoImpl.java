package com.andy.dao.impl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowCallbackHandler;

import com.andy.dao.UserDao;
import com.andy.type.User;

public class UserDaoImpl implements UserDao {
	private JdbcTemplate jdbcTemplate;

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	@Override
	public List<User> findAllUser() {
		String sql = "select * from user";
		final List<User> listAllUser = new ArrayList<User>();
		jdbcTemplate.query(sql, new RowCallbackHandler() {

			@Override
			public void processRow(ResultSet rs) throws SQLException {
				// TODO Auto-generated method stub
				User user = new User();
				user.setId(rs.getString("id"));
				user.setName(rs.getString("name"));
				user.setPassword(rs.getString("password"));
				listAllUser.add(user);
			}
		});
		return listAllUser;
	}

	@Override
	public User findUser(String name) {
		// TODO Auto-generated method stub
		String sql = "select * from user " + "where user.name = '" + name +"'";
		final User user = new User();
	
		jdbcTemplate.query(sql, new RowCallbackHandler() {

			@Override
			public void processRow(ResultSet rs) throws SQLException {
				user.setId(rs.getString("id"));
				user.setName(rs.getString("name"));
				user.setPassword(rs.getString("password"));
			}
		});
		if(user.getId().equals("0"))	return null;
		return user;
	}
}
