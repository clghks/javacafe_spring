package com.javacafe.user;

import com.javacafe.user.dao.DaoFactory;
import com.javacafe.user.dao.UserDao;

public class SingletonMain {
	public static void main(String[] args) {
		DaoFactory daoFactory = new DaoFactory();
		
		UserDao userDao = daoFactory.userDao();
		UserDao userDao1 = daoFactory.userDao();

		System.out.println(userDao);
		System.out.println(userDao1);
	}
}


