package com.javacafe.user;

import java.sql.SQLException;

import com.javacafe.user.dao.ConnectionMaker;
import com.javacafe.user.dao.DConnectionMaker;
import com.javacafe.user.dao.UserDao;
import com.javacafe.user.domain.User;

public class AppMain {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		ConnectionMaker connectionMaker = new DConnectionMaker();
		UserDao userDao = new UserDao(connectionMaker);
		
		User user = new User();
		user.setId("clghks");
		user.setName("최치환");
		user.setPassword("married");
		
		userDao.add(user);
		
		System.out.println(user.getId() + " 등록 성공");
		
		User user2 = userDao.get(user.getId());
		System.out.println(user2.getName());
	}
}
