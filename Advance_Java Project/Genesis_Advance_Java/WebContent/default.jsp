<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body style="background-color: aqua;">
<%
response.setHeader("Cache-Control","no-cache ,no-store,must-revalidate");
%>
<jsp:include page="header.jsp"></jsp:include>
<h1 align="center" style="color: blue;">Home Page </h1>

<h2 align="center">User Registration</h2>
<div align="center">
<form action="./register" method="post">
Username:
<input type="text" name="username"><br><br>
Password:
<input type="password" name="userpass"><br><br>

<input type="submit" name="userReg" value="Register"><br><br>


</form>
<p>Already User ? Click Login</p>
<a href="ulogin.jsp">Login Page</a><br><br>

</div>
<jsp:include page="footer.jsp"></jsp:include>
</body>
</html>