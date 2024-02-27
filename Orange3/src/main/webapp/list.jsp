<%@page import="dao.BoardDao"%>
<%@page import="dto.Board"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ page import="java.sql.*" %>
<%
	String memberId = (String)session.getAttribute("userId"); 
	if(memberId==null){ //로그인 해야만 페이지 접근 가능
		response.sendRedirect("loginForm2.jsp");
	}
	BoardDao dao = BoardDao.getInstance();
	List<Board> list = dao.selectList();
%>
<!doctype html>
<html lang="en">
  <head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Orange - 게시판</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-4bw+/aepP/YC94hEpVNVgiZdgIC5+VKNBQNGCHeKRQN+PtmoHDEXuppvnDJzQIu9" crossorigin="anonymous">
   <link rel="stylesheet" href="${pageContext.request.contextPath}/css/style.css">
  </head>
  <body>

 
<div class="container" style="padding-top: 50px;">
<table class="table table-bordered table-hover">
    <tr>
        <th class="num"    >번호    </th>
        <th class="title"  >제목    </th>
        <th class="name" >작성자  </th>
        <th class="regtime">작성일시</th>
        <th  class="hits"   >조회수  </th>
    </tr>
<%
	for(Board bo :list) {
%>         
        <tr>
            <td><%=bo.getNum()%></td>
            <td style="text-align:left;">
                <a href="post.jsp?num=<%=bo.getNum()%>">
                    <%=bo.getTitle()%>
                </a>
            </td>
            <td><%=bo.getName()%></td>
            <td><%=bo.getRegtime()%></td>
            <td><%=bo.getHits()%></td>
        </tr>
<%
	}
%>
</table>
</div>

<div class="container" style="padding-top: 50px;">
<input type="submit" value="글쓰기" class="btn btn-outline-primary" onclick="location.href='writeForm.jsp'">
</div>

<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.1/dist/js/bootstrap.bundle.min.js" integrity="sha384-HwwvtgBNo3bZJJLYd8oVXjrBZt8cqVSpeBNS5n7C8IVInixGAoxmnlMuBnhbgrkm" crossorigin="anonymous"></script>
</body>
</html>
