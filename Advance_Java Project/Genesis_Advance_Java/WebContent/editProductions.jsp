<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="com.ltts.com.pdao.*,com.ltts.com.production.*,java.util.*" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Edit Productions </h1>

<%
productionDao pd=new productionDao();
int cid=Integer.parseInt(request.getParameter("id"));
prod p=pd.getProductionsrById(cid);
%>

<form action="./updateProd" method="post">
ProdID:
<input type="hidden" name="id" value="<%=cid%>"><br><br>
Production Name:
<input type="text" name ="pname" value="<%=p.getPname()%>"><br><br>

Production Address:
<input type="text" name="address" value="<%=p.getAdress()%>"><br><br>

Start Date:
<input type="text" name="sdate" value="<%=p.getPdate()%>"><br><br>

Owner Name:
<input type="text" name="oname" value="<%=p.getOwner()%>"><br><br>

<input type="submit" value="Update Details"><br> 




</form>
<jsp:include page="footer.jsp"></jsp:include>
</body>
</html>