package com.javacafe.user.dao.impl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import com.javacafe.user.dao.UserDao;

public class DUserDao extends UserDao{

	@Override
	public Connection getConnection() throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver");
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost/springbook", "spring", "book");

		return connection;
	}

}
