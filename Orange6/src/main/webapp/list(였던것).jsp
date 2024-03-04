<%@page import="mvjsp.jdbc.connection.ConnectionProvider"%>
<%@page import="dao.BoardDao"%>
<%@page import="dto.Board"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ page import="java.sql.*" %>
<%
	String memberId = (String)session.getAttribute("userId"); 
//	if(memberId==null){ //로그인 해야만 페이지 접근 가능
//		response.sendRedirect("loginForm2.jsp");
//	}

	Connection conn = ConnectionProvider.getConnection();
	BoardDao dao = BoardDao.getInstance();
	List<Board> list = dao.selectList(conn);
	request.setAttribute("list", list);
%>
<jsp:forward page="/WEB-INF/view/list_view.jsp" />
