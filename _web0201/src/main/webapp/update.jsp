<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
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
String driver="oracle.jdbc.driver.OracleDriver";
String url="jdbc:oracle:thin:@localhost:1521:xe";
Class.forName(driver);
Connection conn = DriverManager.getConnection(url, "scott", "tiger");
String sql ="update emp1 set job=?, sal=? where ename = ?";
PreparedStatement pstmt = conn.prepareStatement(sql);
pstmt.setString(1, request.getParameter("job"));
pstmt.setString(2, request.getParameter("sal"));
pstmt.setString(3, request.getParameter("ename"));

pstmt.executeUpdate();
%>
<button onclick="location.href='index.jsp'">처음으로</button >
<button onclick="location.href='select.jsp'">목록으로</button >

</br>수정 완료!
</body>
</html>