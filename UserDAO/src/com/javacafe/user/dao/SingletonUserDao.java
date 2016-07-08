package com.javacafe.user.dao;

public class SingletonUserDao {
	private static SingletonUserDao INSTANCE;

	private SingletonUserDao(){
		
	}
	
	public static synchronized SingletonUserDao getInstance(){
		if(INSTANCE == null){
			INSTANCE = new SingletonUserDao();
		}
		
		return INSTANCE;
	}
}


