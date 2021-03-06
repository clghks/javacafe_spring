package com.javacafe.user.dao;

import java.sql.Connection;
import java.sql.SQLException;

public class CountingConnectionMaker implements ConnectionMaker{
	int counter = 0;
	ConnectionMaker connectionMaker;
	
	public CountingConnectionMaker(ConnectionMaker connectionMaker){
		this.connectionMaker = connectionMaker;
	}
	
	@Override
	public Connection makeNewConnection() throws ClassNotFoundException, SQLException {
		counter++;
		return connectionMaker.makeNewConnection();
	}
	
	public int getCounter() {
		return counter;
	}

}
