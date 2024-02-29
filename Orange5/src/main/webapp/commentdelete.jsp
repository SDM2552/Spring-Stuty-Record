<%@page import="java.sql.Connection"%>
<%@page import="mvjsp.jdbc.connection.ConnectionProvider"%>
<%@page import="dao.CommentsDao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
int commentId = Integer.parseInt(request.getParameter("commentId"));
int boardId = Integer.parseInt(request.getParameter("boardId"));

Connection conn = ConnectionProvider.getConnection();
CommentsDao dao = CommentsDao.getInstance();
dao.delete(conn, commentId);
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