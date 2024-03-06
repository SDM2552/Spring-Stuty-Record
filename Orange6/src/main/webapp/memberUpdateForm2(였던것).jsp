<%@page import="java.sql.Connection"%>
<%@page import="mvjsp.jdbc.connection.ConnectionProvider"%>
<%@page import="dto.Member"%>
<%@page import="dao.MemberDao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
//    request.setCharacterEncoding("utf-8");
	Connection conn = ConnectionProvider.getConnection();
	Member member = MemberDao.getInstance().select(conn, 
			(int)session.getAttribute("userNumId"));
	request.setAttribute("member", member);
	System.out.println("회원정보수정 체크 "+member);

%>
<jsp:forward page="/WEB-INF/view/memberUpdateForm_view.jsp" />