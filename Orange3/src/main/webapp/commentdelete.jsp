<%@page import="dao.CommentsDao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
int commentId = Integer.parseInt(request.getParameter("commentId"));
int boardId = Integer.parseInt(request.getParameter("boardId"));
CommentsDao dao = CommentsDao.getInstance();
dao.delete(commentId);
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