<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%
	request.setCharacterEncoding("utf-8");
    String id = request.getParameter("id");
    String pw = request.getParameter("pw");
	boolean login = false;
    
    String sql = "select count(*) as cnt from score1 where num = ? and name = ?";
    Class.forName("oracle.jdbc.driver.OracleDriver");
    try ( 
        Connection conn = DriverManager.getConnection(
                "jdbc:oracle:thin:@localhost:1521:xe", "scott", "tiger");
        PreparedStatement pstmt = conn.prepareStatement(sql);
    ) {
    	pstmt.setString(1, id);
    	pstmt.setString(2, pw);
    	ResultSet rs = pstmt.executeQuery();

    	rs.next();
    	int res = rs.getInt("cnt");
    	if (res == 1) {
    		login = true;
    	} else {
    		System.out.println("로그인 실패");
    	}
    	
    } catch(Exception e) {
       System.out.println("오류!");
       e.printStackTrace();
    }
    
    if (login) {
        Cookie cookie = new Cookie("userId", pw); // <--쿠키 저장값을 id->pw로 변경함
        cookie.setMaxAge(-1);         // 웹 브라우저가 닫힐 때 쿠키 만료됨
        response.addCookie(cookie);
        response.sendRedirect("index.jsp");   // 로그인 메인 화면으로 돌아감<-loginPS.jsp에서 수정함
        return;
    }
%>

<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
</head>
<body>

<script>
    alert('아이디 또는 비밀번호가 틀립니다!');
    history.back();
</script>
 
</body>
</html>