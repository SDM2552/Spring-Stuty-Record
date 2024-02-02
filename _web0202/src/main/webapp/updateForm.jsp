<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
	String driver = "oracle.jdbc.driver.OracleDriver";
	String url = "jdbc:oracle:thin:@localhost:1521:xe";
	Class.forName(driver);
	String sql = "select num, name, kor, eng, math from score where name = ?";

	int num = 0;
	String name = "";
	int kor = 0;
	int eng = 0;
	int math = 0;
	
	try (Connection conn = DriverManager.getConnection(url, "scott", "tiger");
			PreparedStatement pstmt = conn.prepareStatement(sql);) {
		pstmt.setString(1, request.getParameter("name"));
		ResultSet rs = pstmt.executeQuery();
		
		if (rs.next()) {
			num = rs.getInt("num");
			name = rs.getString("name");
			kor = rs.getInt("kor");
			eng = rs.getInt("eng");
			math = rs.getInt("math");
		}
		%>
	
	<button onclick="location.href='index.jsp'">처음으로</button>

	<form action="update.jsp" method="post">
		번호 <input type="text" name="num" value="<%=num%>" /><br /> 이름 <input
			type="text" name="name" value="<%=name%>"><br /> 국어 <input
			type="text" name="kor" value="<%=kor%>"><br /> 영어 <input
			type="text" name="eng" value="<%=eng%>"><br /> 수학 <input
			type="text" name="math" value="<%=math%>"><br /> <br /> <input
			type="submit" value="수정"> <input type="reset" value="초기화"><br />

<% } catch (Exception e) {
		e.printStackTrace();
	}
	%>


</body>
</html>