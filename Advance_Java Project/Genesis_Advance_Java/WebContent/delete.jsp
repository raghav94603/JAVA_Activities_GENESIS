<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1 align="center" style="color: red">Delete Data from Table</h1>
<div align="center" >
<form action="./datadelete" method="post">
ProductionId:
<input type="text" name="pid"><br><br><br>
<input type="submit" value="Delete"><br>


</form>
</div>
<jsp:include page="footer.jsp"></jsp:include>
</body>
</html>