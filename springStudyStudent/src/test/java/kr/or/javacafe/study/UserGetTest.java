package kr.or.javacafe.study;

import static org.junit.Assert.assertEquals;

import java.sql.SQLException;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import kr.or.javacafe.study.dao.UserDao;
import kr.or.javacafe.study.domain.User;


public class UserGetTest {

	@Test
	public void test() throws ClassNotFoundException, SQLException {
		
		ApplicationContext context = new GenericXmlApplicationContext("applicationContext.xml");
		UserDao dao = context.getBean("userDao", UserDao.class);
		
		// 조회
		User user = dao.get("1");
		System.out.println(user.getName());
		
		assertEquals("홍길동", user.getName());
	}

	
}
