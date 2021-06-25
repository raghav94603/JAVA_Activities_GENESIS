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
<h1 align="center" style="color: blue;">Productions Table Data</h1>
<%
System.out.println("Productions List ");
productionDao pd=new productionDao();
List<prod> li=pd.getAllproductions();

%>

<table>
<tr>
<th>Production ID</th>
<th>Production Name</th>
<th>Production Address</th>
<th>Start Date</th>
<th>Owner Name</th>

</tr>
<%
for(prod p:li)
{
%>
<tr>
<td><%=p.getPid() %></td>
<td><%=p.getPname()%></td>
<td><%=p.getAdress() %></td>
<td><%=p.getPdate() %></td>
<td><%=p.getOwner() %></td>
<td><a href="editProductions.jsp?id=<%=p.getPid()%>">Update</a></td>

</tr>
<%} %>


</table>
<jsp:include page="footer.jsp"></jsp:include>
</body>

</html>