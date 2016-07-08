package com.javacafe.user;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.javacafe.user.dao.DaoFactory;
import com.javacafe.user.dao.UserDao;

public class SingletonMain {
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(DaoFactory.class);
		UserDao userDao = context.getBean("userDao", UserDao.class);
		UserDao userDao1 = context.getBean("userDao", UserDao.class);

		System.out.println(userDao);
		System.out.println(userDao1);
	}
}
