package com.comit.course._jdbc;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.comit.course._jdbc.bean.User;

public class _02_jdbcStmtList {
	
	public static void main(String[] args) {
		
		String dbUrl = "jdbc:mysql://localhost:3306/usersdb";
		String dbUsername = "root";
		String dbPassword = "Mysql123@";
		
		List<User> users = new ArrayList<>();
		
		String sql = "SELECT * FROM USER WHERE ID_USER= ?";
		
		String input;
		try(Scanner scan = new Scanner(System.in);) {
			System.out.print("Enter the idUser: ");
			input = scan.nextLine();
		}
		
		try(Connection con = DriverManager.getConnection(dbUrl, dbUsername, dbPassword);
			PreparedStatement st = con.prepareStatement(sql);){
			
				st.setString(1, input);
				ResultSet rs = st.executeQuery();
			
			System.out.println("Query: " + sql);
				
			while (rs.next()) {
				
				int idUser = rs.getInt("ID_USER");
				String firstName = rs.getString("FIRST_NAME");
				String lastName = rs.getString("LAST_NAME");
				String userName = rs.getString("USERNAME");
				String password = rs.getString("PASSWORD");
				Date birth = rs.getDate("BIRTH");
				String status = rs.getString("STATUS");
				
				User user = new User();
				
				user.setIdUser(idUser);
				user.setFirstName(firstName);
				user.setLastName(lastName);
				user.setUserName(userName);
				user.setPassword(password);
				user.setBirth(birth);
				user.setStatus(status);
				
				users.add(user);
				
				
			}
			//System.out.println("Connection Successful!");
			
		} catch (SQLException e) {
			System.err.format("SQL State: %s%n%s", e.getSQLState(),e.getMessage());
		} 
		
		users.forEach(System.out::println);
		
	}

}
