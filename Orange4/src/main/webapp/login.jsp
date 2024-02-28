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
	System.out.println(remember);
	if (remember != null && remember.equals("on")) {
		response.addCookie(Cookies.createCookie("rememberId", rememberId, "/", 60 * 60));
		System.out.println("생성된 쿠키: " + request.getParameter("remember")+" + "+request.getParameter("id"));
	} else {
		response.addCookie(Cookies.createCookie("rememberId", "", "/", 0));
	}
	
	if(member != null){
	session.setAttribute("userNumId", member.getNumId());
	session.setAttribute("userId", member.getId());
	session.setAttribute("userName", member.getName());
	response.sendRedirect("index2.jsp");
	System.out.println("세션에 저장된 값: " +member.getNumId()+" + "+member.getId()+" + "+member.getName() );
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