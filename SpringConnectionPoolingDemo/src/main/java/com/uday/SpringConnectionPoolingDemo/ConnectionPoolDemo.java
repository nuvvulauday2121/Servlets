package com.uday.SpringConnectionPoolingDemo;

import java.sql.SQLException;

import org.apache.commons.dbcp.BasicDataSource;

public class ConnectionPoolDemo {
	
	public static void main(String[] args) {
		BasicDataSource basicDataSource = new BasicDataSource();
		basicDataSource.setUrl("jdbc:mysql://localhost:3306/world");
		basicDataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
		basicDataSource.setUsername("root");
		basicDataSource.setPassword("2121");
		
		try {
			System.out.println(basicDataSource.getConnection());
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
