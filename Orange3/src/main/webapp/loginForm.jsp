
<%@page import="util.Cookies"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	Cookies cookies = new Cookies(request);
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="login.jsp" method="post">
<%
	if(cookies.exists("rememberId")){
%>
아이디:  <input type="text" name="id" value="<%=cookies.getValue("rememberId")%>"><br>
비밀번호: <input type="password" name="pw"><br>
<%
	} else {
%>
아이디:  <input type="text" name="id"><br>
비밀번호: <input type="password" name="pw"><br>
<%
	}
%>
remember me: <input type="checkbox" name="remember" checked/>
<input type="submit" value="로그인">
<input type="button" value="회원가입" onclick="window.location.href='memberJoinForm.jsp';">
</form>

</body>
</html>