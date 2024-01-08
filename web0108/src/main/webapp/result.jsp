<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%
    int num =Integer.parseInt(request.getParameter("mmm"));
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%=num %>
<%
for(int i=1;i<10;i++){
%>
	<h2><%=num%> X <%=i %>=<%=i*num %></h2>
<%} %>
</body>
</html>