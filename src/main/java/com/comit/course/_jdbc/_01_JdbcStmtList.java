package com.comit.course._jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class _01_JdbcStmtList {

	public static void main(String[] args) {
		
		String dbUrl = "jdbc:mysql://localhost:3306/usersdb";
		String dbUsername = "root";
		String dbPassword = "Mysql123@";
		
		try {
			Connection con = DriverManager.getConnection(dbUrl, dbUsername, dbPassword);
			
			System.out.println("Connection successful!");
		} catch (SQLException e) {
			System.err.println("Error while connecting to the DB");
			e.printStackTrace();
		}
	}
}
