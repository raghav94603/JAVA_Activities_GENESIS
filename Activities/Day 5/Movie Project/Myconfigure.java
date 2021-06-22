package com.ltts.configure;

import java.sql.*;
import java.lang.*;

public class Myconfigure{

	public static Connection getConnection() throws Exception{
		Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3305/genesis","root","asawa123");
		return c;
}
}
