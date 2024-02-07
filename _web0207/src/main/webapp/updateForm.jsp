<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>성적표</title>
</head>
<body>

	<button onclick="location.href='index.jsp'">처음으로</button>
	<%
String url = "jdbc:oracle:thin:@localhost:1521:xe";
Connection conn = DriverManager.getConnection(url, "scott", "tiger");
String sql = "select * from score1 where num = ?";
PreparedStatement pstmt = conn.prepareStatement(sql);
pstmt.setString(1, request.getParameter("num"));
ResultSet rs = pstmt.executeQuery();
String num = "";
String name = "";
String kor = "";
String eng = "";
String math = "";

if(rs.next()){ 
	num = rs.getString("num");
	name = rs.getString("name");
	kor = rs.getString("kor");
	eng = rs.getString("eng");
	math = rs.getString("math");
}
%>

	<form action="update.jsp" method="post">
		번호 <input type="text" name="num" value="<%=num%>"><br /> 
		이름 <input type="text"name="name" value="<%=name%>"><br /> 
		국어 <input type="text" name="kor" value="<%=kor%>"><br />
		영어 <input type="text" name="eng" value="<%=eng%>"><br /> 
		수학 <input type="text"name="math" value="<%=math%>"><br /> <br /> 
			<button>수정</button>
		</form>
			<button onclick="location.href='delete.jsp?num<%=num%>'">삭제</button>
</body>
</html>