<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body style="background-color: black;">
<jsp:include page="header.jsp"></jsp:include>
<%
response.setHeader("Cache-Control","no-cache ,no-store,must-revalidate");
%>
<h1 align="center" style="color: yellow;">Login To Database</h1>
<br><br>
<div align="center">
<form style="background-color: white; align-self: center; align-content: center; align-items: center;" action="./login.jsp" method="post">
Username:
<input type="text" name="username"><br><br>
Password:
<input type="password" name="userpass"><br><br>

<input type="submit" name="userlog" value="Login"><br><br>
</form>
</div>
<jsp:include page="footer.jsp"></jsp:include>
</body>
</html>