package kr.or.javacafe.study.dao;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DaoFactory {

	@Bean
	public UserDao userDao() {
		UserDao userDao = new UserDao(getConnection());
		
		return userDao;
	}
	
	@Bean
	public ConnectionMaker getConnection(){
		return new DConnectionMaker();

	}
}
