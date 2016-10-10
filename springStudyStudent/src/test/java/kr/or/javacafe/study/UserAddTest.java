package kr.or.javacafe.study;

import java.sql.SQLException;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import kr.or.javacafe.study.dao.UserDao;
import kr.or.javacafe.study.domain.User;


public class UserAddTest {

	@Test
	public void test() throws ClassNotFoundException, SQLException {
		
		ApplicationContext context = new GenericXmlApplicationContext("applicationContext.xml");
		UserDao dao = context.getBean("userDao", UserDao.class);
		
		// 저장
		User user = new User();
		user.setId("1");
		user.setName("홍길동");
		user.setPassword("1234");
		
		dao.add(user);
	}

	
}
