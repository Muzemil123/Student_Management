package com.DbConnect;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnect {
	
	private static Connection conn=null;
	
	public static Connection getCon() {
		 try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/student_db","root","Password@123");
		} catch (Exception e) {
			// TODO: handle exception
		}
		 return conn;
	}
	
	

}
