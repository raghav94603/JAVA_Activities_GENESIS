<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
try
{
	
	response.setHeader("Cache-Control","no-cache ,no-store,must-revalidate");
  
session.removeAttribute("username"); 

if(session.getAttribute("username")==null)
{
	session.invalidate();
	
	response.sendRedirect("default.jsp");
}
}
catch(Exception e)
{
	System.out.println(e);
}

%>

</body>
</html>