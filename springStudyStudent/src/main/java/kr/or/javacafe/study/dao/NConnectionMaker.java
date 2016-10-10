package kr.or.javacafe.study.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class NConnectionMaker implements ConnectionMaker{

	@Override
	public Connection getConnection() throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver");
		Connection c = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/study?autoReconnect=true&useUnicode=true&characterEncoding=utf8&useSSL=true", "user", "user");
		
		return c;
	}

}
