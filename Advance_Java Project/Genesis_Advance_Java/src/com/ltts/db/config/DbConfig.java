package com.ltts.db.config;
import java.sql.*;

public class DbConfig {

	public static Connection getConnection() throws Exception{
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3305/genesis","root","asawa123");
		return con;	
	
}
}
