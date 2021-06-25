<%@page import="org.apache.jasper.tagplugins.jstl.core.Redirect"%>
<%@page import="javax.swing.JOptionPane"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="java.sql.*" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<%
String s1=request.getParameter("username");
String s2=request.getParameter("userpass");


try
{
	

	Class.forName("com.mysql.cj.jdbc.Driver");
	Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3305/genesis","root","asawa123");
	Statement st=con.createStatement();
	HttpSession ssession=request.getSession();
	String j="select username,password from userdata where username='"+s1+"' and password='"+s2+"'";
	ResultSet rs=st.executeQuery(j);
	if(rs.next())
	{
		
		if(rs.getString("username").equals(s1) && rs.getString("password").equals(s2) )
		
	{
		System.out.println("Login Successful");
		
		response.sendRedirect("home.jsp");
		ssession.setAttribute("username", s1);
		
	}
	}
	else
	{
		System.out.println("Wrong Username and Password");
	}
}
catch(Exception e)
{
	System.out.println("Error !!!");
}
	
	



%>


</body>
</html>