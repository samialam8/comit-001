package com.comit.course._jdbc;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class _01_JdbcStmtList {

	public static void main(String[] args) {
		
		String dbUrl = "jdbc:mysql://localhost:3306/usersdb";
		String dbUsername = "root";
		String dbPassword = "Mysql123@";
		
		String sql = "SELECT * FROM USER";
		
		try(Connection con = DriverManager.getConnection(dbUrl, dbUsername, dbPassword);
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery(sql);) {
			
			
		
			
			while (rs.next()) {
				int idUser = rs.getInt("ID_USER");
				String firstName = rs.getString("FIRST_NAME");
				String lastName = rs.getString("LAST_NAME");
				String userName = rs.getString("USERNAME");
				String password = rs.getString("PASSWORD");
				Date birth = rs.getDate("BIRTH");
				String status = rs.getString("STATUS");
				
				System.out.println(idUser + " " + firstName + " " + lastName + " " +  userName + " " + password + " " + birth + " " + status);
			}
			
			System.out.println("Connection successful!");
		} catch (SQLException e) {
			System.err.println("Error while connecting to the DB");
			e.printStackTrace();
		} 
		
	}
}
