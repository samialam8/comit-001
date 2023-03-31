package com.comit.course._jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.sql.Date;
import java.util.List;
import java.util.Scanner;

import com.comit.course._jdbc.bean.User;

public class _04_JdbcPreStmInsert {

	public static void main(String[] args) {
		
		String dbUrl = "jdbc:mysql://localhost:3306/usersdb";
		String dbUsername = "root";
		String dbPassword = "Mysql123@";
		
		SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
		
		List<User> users = new ArrayList<>();
		
		String sql = "INSERT INTO USER(USERNAME, PASSWORD, FIRST_NAME, LAST_NAME, BIRTH, STATUS) "
				     + "VALUES(?,?,?,?,?,?)";
		
		User user = new User();
				
		
		String input = null;
		try(Scanner scan = new Scanner(System.in);) {
			
			System.out.print("Enter the username: ");
			user.setUserName(scan.nextLine());
			
			System.out.print("Enter the password: ");
			user.setPassword(scan.nextLine());
		
			System.out.print("Enter the first name: ");
			user.setFirstName(scan.nextLine());
			
			System.out.print("Enter the last name: ");
			user.setLastName(scan.nextLine());
			
			System.out.print("Enter the date of birth yyyy-MM-dd: ");
			user.setBirth(formatter.parse(scan.nextLine()));
			
			System.out.print("Enter the status: ");
			user.setStatus(scan.nextLine());
			
		} catch (ParseException e) {
			System.err.format("Error while parsing date: %s%n%n", e.getMessage());	
			System.exit(-1);
		}
		
		System.out.println("Query: " + sql);
		
		try(Connection con = DriverManager.getConnection(dbUrl, dbUsername, dbPassword);
			PreparedStatement st = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);) {
			
			st.setString(1, user.getUserName());
			st.setString(2, user.getPassword());
			st.setString(3, user.getFirstName());
			st.setString(4, user.getLastName());
			st.setDate(5, new Date(user.getBirth().getTime()));
			st.setString(6, user.getStatus());
			
			int row = st.executeUpdate();
			
			System.out.println("Number of rows affected: " + row);
			
			try(ResultSet resultSet = st.getGeneratedKeys()) {
				if (resultSet.first()) {
					System.out.printf("The ID_USER of new user : %d%n", resultSet.getInt(1));
					user.setIdUser(resultSet.getInt(1));
				}
			}
				
			//System.out.println("Connection Successful!");
			
		} catch (SQLException e) {
			System.err.format("SQL State: %s%n%s", e.getSQLState(),e.getMessage());
		} 
		
		System.out.println(user);
		
	}
}
