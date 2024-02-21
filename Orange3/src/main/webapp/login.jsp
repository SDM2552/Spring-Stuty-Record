<%@page import="util.Cookies"%>
<%@page import="dto.Member"%>
<%@page import="dao.MemberDao"%>
<%@page import="javax.servlet.http.Cookie" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	String id = request.getParameter("id");
	String pw = request.getParameter("pw");
	Member member = MemberDao.getInstance().selectForLogin(id, pw);
	
	String remember = request.getParameter("remember");
	String rememberId = request.getParameter("id");
	if (remember != null && remember.equals("on")) {
		response.addCookie(Cookies.createCookie("rememberId", rememberId, "/", 60 * 60 * 24));
	} else {
		response.addCookie(Cookies.createCookie("rememberId", "", "/", 0));
	}
	
	if(member != null){
	session.setAttribute("userId", member.getId());
	session.setAttribute("userName", member.getName());
	response.sendRedirect("index.jsp");
	return;
	}
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<script>
    alert('아이디 또는 비밀번호가 틀립니다!');
    history.back();
</script>

</body>
</html>