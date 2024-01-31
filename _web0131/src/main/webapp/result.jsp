<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>제목</title>
</head>
<body>
	<%
	request.setCharacterEncoding("utf-8");
	%>
	<%
	String str = "dasdsad";
	out.println("<h2>"+str+"<h2/>");
	%>
	<form action="result.jsp">
		국어<%=request.getParameter("kor")%><br /> 수학<%=request.getParameter("math")%><br />
		영어<%=request.getParameter("eng")%><br />
		<h1><%=str%></h1>
	</form>
</body>
</html>