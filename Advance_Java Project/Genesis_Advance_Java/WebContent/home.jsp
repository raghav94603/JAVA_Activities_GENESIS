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
response.setHeader("Cache-Control","no-cache ,no-store,must-revalidate");
%>
<h1 align="center" style="color: red;">Welcome To Productions Database</h1>
<div align="center">
<h2>Select The Link Needed</h2>
<a href="prodinsert.html">Insert Data</a> |             <a href="viewAll.jsp">View and Update Data</a> |<a href="delete.jsp">Delete Data</a>
<br><br><br><br>
<p>The Current Session is Managed By </p>
<%=session.getAttribute("username")%>
<br><br><br>
<a href="logout.jsp">Logout</a>

</div>

<jsp:include page="footer.jsp"></jsp:include>
</body>
</html>