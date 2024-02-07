<%@page import="java.sql.Connection"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.DriverManager"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
	request.setCharacterEncoding("utf-8");
	//String driver="oracle.jdbc.driver.OracleDriver";
	String url = "jdbc:oracle:thin:@localhost:1521:xe";
	Connection conn = DriverManager.getConnection(url, "scott", "tiger");
	String sql = "insert into score1(num,name,kor,eng,math) values(?,?,?,?,?)";
	PreparedStatement pstmt = conn.prepareStatement(sql);
	pstmt.setString(1, request.getParameter("num"));
	pstmt.setString(2, request.getParameter("name"));
	pstmt.setInt(3, Integer.parseInt(request.getParameter("kor")));
	pstmt.setInt(4, Integer.parseInt(request.getParameter("eng")));
	pstmt.setInt(5, Integer.parseInt(request.getParameter("math")));
	int res = pstmt.executeUpdate();
	
	response.sendRedirect("index.jsp");
	%>
</body>
</html>