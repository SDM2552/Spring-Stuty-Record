<%@page import="java.sql.Connection"%>
<%@page import="mvjsp.jdbc.connection.ConnectionProvider"%>
<%@page import="dto.Comments"%>
<%@page import="dao.CommentsDao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%
	request.setCharacterEncoding("utf-8");

	int boardId = Integer.parseInt(request.getParameter("boardId"));
	String commentWriter = (String)session.getAttribute("userName");
	String comment = request.getParameter("comment");
	
	Connection conn = ConnectionProvider.getConnection();
	CommentsDao dao = CommentsDao.getInstance();
	Comments comments = new Comments(boardId, commentWriter, comment);
	dao.insert(conn, comments);
	response.sendRedirect("post.jsp?num="+boardId);
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

</body>
</html>