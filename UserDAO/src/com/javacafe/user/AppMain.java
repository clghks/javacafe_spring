package com.javacafe.user;

import java.sql.SQLException;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.javacafe.user.dao.DaoFactory;
import com.javacafe.user.dao.UserDao;
import com.javacafe.user.domain.User;

public class AppMain {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		ApplicationContext context = new AnnotationConfigApplicationContext(DaoFactory.class);
		UserDao userDao = context.getBean("userDao", UserDao.class);
		
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
