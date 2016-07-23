package com.javacafe.user;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.javacafe.user.dao.ConnectionMaker;
import com.javacafe.user.domain.User;

public class SingletonUserDao {
	private ConnectionMaker connectionMaker;
	private Connection connection;
	private User user;
	
	public SingletonUserDao(ConnectionMaker connectionMaker){
		this.connectionMaker = connectionMaker;
	}
	
	public User get(String id) throws ClassNotFoundException, SQLException {
		connection = connectionMaker.makeNewConnection();
		
		PreparedStatement preparedStatement = connection.prepareStatement("select * from users where id = ?");
		preparedStatement.setString(1, id);
		
		ResultSet resultSet = preparedStatement.executeQuery();
		resultSet.next();
		
		user = new User();
		user.setId(resultSet.getString("id"));
		user.setName(resultSet.getString("name"));
		user.setPassword(resultSet.getString("password"));
		
		preparedStatement.close();
		connection.close();
		resultSet.close();
		
		return user;
	}

}
