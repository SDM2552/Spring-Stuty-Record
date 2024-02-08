<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%
    Cookie cookie = new Cookie("userId", null);
    cookie.setMaxAge(0);           
    response.addCookie(cookie);
        
//    response.sendRedirect("loginCK.jsp");   // 로그인 메인 화면으로 돌아감
%>
<html>
<head>
</head>
<body>
<script>
    alert('로그아웃 완료');
	location.replace("index.jsp");   // 로그인 메인 화면으로 돌아감
</script>
</body>
</html>